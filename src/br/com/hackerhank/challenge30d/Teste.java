package br.com.hackerhank.challenge30d;

import java.util.Scanner;

public class Teste {

    public static int factorial(int n) {
        int x = n;
        if (n >= 2 && n <= 12) {
            while (n>1){
                x = x * (n-1);
                n--;
            }
        } else {
            System.out.println("n esta fora do escopo");
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));

    }
}
