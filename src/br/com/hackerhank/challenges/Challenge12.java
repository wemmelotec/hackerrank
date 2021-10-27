package br.com.hackerhank.challenges;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
//Date and Time
public class Challenge12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes = input.nextInt();
        int dia = input.nextInt();
        int ano = input.nextInt();

        System.out.println(findDay(ano,mes,dia));

        System.out.println(findDayString(ano,mes,dia));
    }
    //V1
    static DayOfWeek findDay(int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year,month,day);
        return localDate.getDayOfWeek();
    }

    //V2
    static String findDayString(int year, int moth, int day){
        return LocalDate.of(year,moth,day).getDayOfWeek().name();
    }
}
