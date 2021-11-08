package br.com.hackerhank.challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Challenge16 {
    public static void main(String[] args) {
        String s = "welcometojava";
        String temp = "";
        int k  = 3;
        int i = 0;
        int contador =0;
        ArrayList<String> list = new ArrayList();

        while (contador<s.length()/k){
            temp = s.substring(i,i+k);
            list.add(temp);
            i = i+k;
            contador++;
        }
//        for (int i = 0; i < s.length()/k; i++) {
//            temp = s.substring(i,i+k);
//            list.add(temp);
//        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

    }
}
