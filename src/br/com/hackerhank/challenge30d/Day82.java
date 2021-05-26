package br.com.hackerhank.challenge30d;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day82 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        if (n >= 1 && n <= Math.pow(10, 5)){
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                in.nextLine();
                myMap.put(name, phone);
            }
        }
        while(in.hasNext()){
            String s = in.next();
            if(myMap.get(s) == null)
                System.out.println("Not found");
            else {
                System.out.println(s + "=" + myMap.get(s));
            }
        }
        in.close();
    }
}
