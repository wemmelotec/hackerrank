package br.com.hackerhank.challenges;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//Java Currency Formatter
// receber um valor e converter ele para as moedas dos locais desejados
public class Challenge13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        // criar o indiaLocale
        Locale indiaLocale = new Locale("en","IN");

        // criar os formatadores ou conversores do valor usando o locale
        //
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        //System.out.println(us.getCurrency());
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        //System.out.println(india.getCurrency());
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

    }
}
