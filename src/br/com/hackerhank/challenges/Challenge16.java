package br.com.hackerhank.challenges;

import java.util.*;

public class Challenge16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String str=scan.next();
        int k=scan.nextInt();

        SortedSet<String> sets = new TreeSet<String>();

        for(int i=0;i<=str.length()-k;i++){
            sets.add(str.substring(i,i+k));
        }

        System.out.println(sets);

        System.out.println(sets.first());
        System.out.println(sets.last());
    }
}
