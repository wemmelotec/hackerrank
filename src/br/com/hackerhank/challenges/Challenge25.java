package br.com.hackerhank.challenges;

import java.math.BigInteger;
import java.util.Scanner;

//Java Primality(se é primo) Test
public class Challenge25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        if (n.isProbablePrime(50)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }


    }
}
