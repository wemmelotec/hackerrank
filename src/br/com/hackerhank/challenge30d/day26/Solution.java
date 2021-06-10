package br.com.hackerhank.challenge30d.day26;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diaDevolucao = scan.nextInt();
        int mesDevolucao = scan.nextInt();
        int anoDevolucao = scan.nextInt();
        int diaEsperado = scan.nextInt();
        int mesEsperado = scan.nextInt();
        int anoEsperado = scan.nextInt();

        LocalDate dataEsperada = LocalDate.of(anoEsperado, mesEsperado, diaEsperado); //cria um objeto do tipo LocalDate
        LocalDate dataDevolucao = LocalDate.of(anoDevolucao, mesDevolucao, diaDevolucao);

        long fine = 0;

        if(dataDevolucao.isAfter(dataEsperada)) {

            if ( dataEsperada.getYear() == dataDevolucao.getYear() ) {
                if (dataEsperada.getMonth() == dataDevolucao.getMonth()) {
                    long diasDeDiferenca = ChronoUnit.DAYS.between(dataEsperada, dataDevolucao);
                    fine = 15 * diasDeDiferenca;
                } else {
                    long mesesDeDiferenca = ChronoUnit.MONTHS.between(dataEsperada, dataDevolucao);
                    fine = 500 * mesesDeDiferenca;
                }
            } else {
                fine = 10000;
            }
        }
        System.out.println(fine);
    }
}
