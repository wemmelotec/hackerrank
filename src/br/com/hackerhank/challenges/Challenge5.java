package br.com.hackerhank.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            stringList.add(s1);
            integerList.add(x);
        }
        System.out.println("================================");
        for(int i =0 ; i<3; i++){
            String s1 = stringList.get(i);
            Integer x = integerList.get(i);
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
