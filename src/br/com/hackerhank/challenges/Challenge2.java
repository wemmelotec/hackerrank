package br.com.hackerhank.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        for (int i=0; i<=2;i++){
            integerList.add(input.nextInt());
        }
        for (Integer numero:integerList) {
            System.out.println(numero);
        }
    }
}
