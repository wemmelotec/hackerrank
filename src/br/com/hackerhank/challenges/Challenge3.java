package br.com.hackerhank.challenges;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numero = input.next();
        if (numero.substring(0, 1).matches("[0-9]")) {
            Integer numeroInt = Integer.parseInt(numero);

            if (numeroInt == 1 || numeroInt > 20) {
                System.out.println("Not Weird");
            }
            if (numeroInt >= 2 && numeroInt <= 5) {
                System.out.println("Not Weird");
            }
            if (numeroInt >= 6 && numeroInt <= 20) {
                System.out.println("Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
