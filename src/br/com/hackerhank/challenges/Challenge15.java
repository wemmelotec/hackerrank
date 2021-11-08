package br.com.hackerhank.challenges;

import java.util.Scanner;

//Java Substring
public class Challenge15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start,end));

    }
}
