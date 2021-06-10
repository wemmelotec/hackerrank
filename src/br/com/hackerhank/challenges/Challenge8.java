package br.com.hackerhank.challenges;

import java.util.Scanner;

//Tipos de dados DataTypes
/*
Dado uma quantidade de t vezes, repita, dado um número verifique em que tipo ele se encaixa e imprima
 */
public class Challenge8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:"); //pode ser encaixado em
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");//não pode ser encaixado em lugar nenhum
            }

        }
    }
}
