package br.com.hackerhank.challenges;

import java.util.Scanner;

//Java Int to String
public class Challenge11 {
    public static void main(String[] args) {
        int n = 10;
        String x = null;
        //Scanner input = new Scanner(System.in);
        //n = input.nextInt();
        x = String.valueOf(n);

        if(x.matches("[0-9]*")){
            System.out.println("Good job");
        }else {
            System.out.println("Wrong answer.");
        }

    }
}
