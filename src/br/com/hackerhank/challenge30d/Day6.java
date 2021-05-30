package br.com.hackerhank.challenge30d;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();

        if (t >= 1 && t <= 10) {

            for (int j = 0; j < t; j++) {
                String x = input.nextLine();
                if (x.length() >= 2 && x.length() <= 10000) { //length retorna um int da quantidade de caracteres da string
                    for (int i = 0; i < x.length(); i++) {
                        if (i % 2 == 0) {
                            System.out.print(x.charAt(i)); //charAt retorna o caractere especifico do index informado
                        }
                    }
                    System.out.print(" ");
                    for (int i = 0; i < x.length(); i++) {
                        if (i % 2 == 1) {
                            System.out.print(x.charAt(i));

                        }
                    }
                    System.out.println();
                }else{
                    System.out.println("Length out off constraints");
                }

            }

        } else {
            System.out.println("T out off constraints");
        }

    }
}
