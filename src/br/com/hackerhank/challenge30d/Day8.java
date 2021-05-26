package br.com.hackerhank.challenge30d;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> listaTelefonica = new HashMap<>();
        int n = in.nextInt();
        if (n >= 1 && n <= Math.pow(10, 5)) {
            for (int i = 0; i < n; i++) {
                String name = in.next();
                int phone = in.nextInt();
                listaTelefonica.put(name, phone);
            }
        } else {
            System.out.println("n fora do escopo");
            return;
        }
        String[] query = new String[listaTelefonica.size()];
        for (int i = 0; i < query.length; i++) {
            query[i] = in.next();
        }

        for (int i = 0; i < query.length; i++) {
            for (Map.Entry<String, Integer> entry : listaTelefonica.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(query[i])) {
                    System.out.println(entry.getKey() + "=" + entry.getValue());
                    return;
                } else {
                    System.out.println("Not found");
                    return;
                }

            }
        }
        in.close();
    }


}

