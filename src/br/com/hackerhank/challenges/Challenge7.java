package br.com.hackerhank.challenges;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int teste = input.nextInt();
        int a, b, n;
        if (teste >= 0 && teste <= 500) {
            for (int t = 0; t < teste; t++) {
                a = input.nextInt();
                b = input.nextInt();
                n = input.nextInt();
                if (a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <= 15) {
                    loop(a, b, n);
                }
            }
        } else {
            System.out.println("Teste esta fora do escopo");
        }
        input.close();
    }

    static void loop(int a, int b, int n) {
        int sum = a;
        for (int x = 0; x < n; x++) {
            sum += b * (1 << x);
            System.out.print(sum + " ");
        }
        //System.out.println();
    }
}
