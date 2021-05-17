package br.com.hackerhank.challenge30d;


import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meal;
        int tip, tax;
        meal = scanner.nextDouble();
        tip = scanner.nextInt();
        tax = scanner.nextInt();

        solve(meal,tip,tax);
    }
    public static void solve(Double meal, int tip, int tax){
        double tip_perc = (meal/100)*tip;
        double tax_perc = (meal/100)*tax;
        int total =(int)Math.round(meal+tip_perc+tax_perc);
        System.out.println(total);
    }
}
