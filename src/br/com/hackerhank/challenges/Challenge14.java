package br.com.hackerhank.challenges;
//Java Strings Introduction
public class Challenge14 {
    public static void main(String[] args) {
        String A = "azul";
        String B = "verde";
        //soma os tamanhos das strings
        System.out.println(A.length()+B.length());
        //verifica se a variazel a vem primeiro na do que a variável b, na ordem alfabética
        //se negativo não vem antes, se 0 mesma posição, se positivo vem depois
        System.out.println(A.compareTo(B)>0?"Yes":"No");

        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));


    }


}
