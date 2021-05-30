package br.com.hackerhank.challenge30d;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int consec1=0;
        if(n>=1 && n<=Math.pow(10,6)){
            String strBinario = Integer.toString(n, 2); //transforma o n para uma string de binario radix é base 2
            String[] strparts = strBinario.split("0"); //separa a String onde tiver o 0
            //System.out.println(strparts.length);
            for(int i=0;i<strparts.length;i++ ){
                if (consec1 < strparts[i].length()) {
                    consec1 = strparts[i].length();
                }
            }
            System.out.println(consec1);  //result
        }

    }
}
