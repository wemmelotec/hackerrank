package br.com.hackerhank.challenge30d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day11 {
    public static void main(String[] args) throws IOException {
//        int rowSize = 6;
//        int colSize = 6;
//        int count = 0;
//        int [][] array = new int[rowSize][colSize];
//        //preencher o array
//        for (int i = 0; i<rowSize; i++){
//            for (int j=0; j<colSize; j++, count++){
//                array[i][j]=count;
//            }
//        }
//        for (int i = 0; i<rowSize; i++){
//            for (int j=0; j<colSize; j++){
//                System.out.print(array[i][j]+"\t");
//            }
//            System.out.println();
//        }
        /*
        A função do InputStreamReader é servir como um adaptador (Adapter) entre as duas classes
        - lê bytes de um lado, converte em caracteres do outro, através do uso de uma codificação de caracteres (encoding).
         Ou seja, ele é um Reader que recebe um InputStream na construção, consumindo dados desse stream e apresentando-os como
          caracteres para o consumidor, nesse caso a BufferedReader.
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//faz a leitura de dados binários a partir do console

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int max = -64, temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                        arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (temp > max){
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
