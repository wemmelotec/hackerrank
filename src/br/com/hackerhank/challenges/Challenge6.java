package br.com.hackerhank.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Challenge6 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            if(N >= 2 && N<=22){
                IntStream.range(1, 11).forEach(s -> System.out.println(N + " x " + s + " = " + N * s));
            }else {
                System.out.println("O numero digitado nao esta entre 2 e 22");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
