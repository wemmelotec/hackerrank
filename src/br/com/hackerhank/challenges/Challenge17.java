package br.com.hackerhank.challenges;
//Java String Reverse
public class Challenge17 {
    public static void main(String[] args) {
        String x = "madam";
        System.out.println(new StringBuilder(x).reverse().toString());
        System.out.println( x.equals( new StringBuilder(x).reverse().toString())
                ? "Yes" : "No" );

        }
    }

