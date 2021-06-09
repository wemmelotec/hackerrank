package br.com.hackerhank.challenge30d.day25;

import java.util.Scanner;

//esse desafio servio para verificar dentro de um array de inteiros, quais números são primos

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 1 && n <= 30) {
            int[] inteiros = new int[n];
            for (int i = 0; i < inteiros.length; i++) {
                inteiros[i] = scanner.nextInt();
            }
            for (int x : inteiros) {
                if (isPrimo(x) == true) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        }

    }

    private static boolean isPrimo(int n) {
        double numberSqrt = Math.sqrt(n);

        if (n <= 1)
            return false;

        else {
            for (int j = 2; j <= numberSqrt; j++) {
                if (n % j == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
