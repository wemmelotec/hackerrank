package br.com.hackerhank.challenge30d;

import java.io.IOException;
import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
//        public static void main(String[] args) throws IOException {
////            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////
////            String S = bufferedReader.readLine();
////
////            bufferedReader.close();
        Scanner input = new Scanner(System.in);
        String s = input.next();
        try{
            Integer x = Integer.parseInt(s);
            System.out.println(s);
        }catch (Exception e){
            System.out.println("Bad String");
        }


    }
}
