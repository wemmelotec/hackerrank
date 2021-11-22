package br.com.hackerhank.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp {

    public static void main(String[] args) {

//        String str = " as ";
//        //System.out.println(str.trim().length());
//        if ((str.trim()).length() > 0) {
//            System.out.println("The string contains characters other than white spaces \n");
//        } else {
//            System.out.println("The string contains only white spaces \n");
//        }
//
//        str = "    ";
//
//        if ((str.trim()).length() > 0) {
//            System.out.println("The string contains characters other than white spaces \n");
//        } else {
//            System.out.println("The string contains only white spaces \n");
//        }

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex);

        String texto = "abaaaba";
        Matcher matcher = pattern.matcher(texto);

        System.out.println(matcher.pattern());
    }
}
