package br.com.hackerhank.challenges;

import java.util.Arrays;

//Java Anagrams
public class Challenge18 {

    static void isAnagrama(String str1, String str2){
        //retirar os espaços em branco existentes na string
        String s1 = str1.replaceAll("\\s","");
        String s2 = str2.replaceAll("\\s","");
        boolean status = true;

        if(s1.length() != s2.length()){
            status = false;
        }else{
            char[] arrayS1 = s1.toLowerCase().toCharArray();
            char[] arrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            status = Arrays.equals(arrayS1,arrayS2);
        }

        if(status){
            System.out.println(s1 + " e " + s2 + " are anagrams");
        }else {
            System.out.println(s1 + " e " + s2 + " are not anagrams");
        }
    }
    public static void main(String[] args) {
        isAnagrama("Mother In Law", "Hitler Woman");
    }
}
