package br.com.hackerhank.challenge30d;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n>=2 && n<=20){
            for (int i = 1; i<=10; i++){
                System.out.println(n +" x "+ i +" = "+ n*i);
            }
        }else {
            System.out.println("n esta fora da restricao");
        }
    }
}
