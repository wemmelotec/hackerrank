package br.com.hackerhank.challenge30d;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rascunho {
    public static void main(String[] args) {
//        String str = "gustava";
//        System.out.println(str.replaceAll("a", "b"));


        Stream<String> stringStream = Stream.of("Geeks","for","GeeksforGeeks","Geeks Classes");
        List<String> myList = stringStream.collect(Collectors.toList());
        System.out.println(myList);



    }
}
