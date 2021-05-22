package br.com.hackerhank.challenge30d;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n>=1 && n<=1000){
            int[] inteiros = new int[n];
            for (int i=0; i<inteiros.length; i++){
                int y = input.nextInt();
                if(y>=1 && y<=10000){
                    inteiros[i] = y;
                }
            }
            for(int i= inteiros.length-1; i>=0; i--){
                System.out.print(inteiros[i]+"\t");
            }
        }

    }
}
