package br.com.hackerhank.challenge30d;

import java.util.Scanner;
/*
Challenge Day 4
 */
public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge <= 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.\n");
        }

    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T >= 1 && T <= 4) {
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                if (age >= -5 && age <= 30) {
                    Person p = new Person(age);
                    p.amIOld();
                    for (int j = 0; j < 3; j++) {
                        p.yearPasses();
                    }
                    p.amIOld();
                    System.out.println();
                }else{
                    System.out.println("Age esta fora da restricao");
                }

            }
        } else {
            System.out.println("T esta fora da restricao");
        }

        sc.close();
    }
}
