package br.com.hackerhank.challenge30d;

import java.util.Scanner;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int quantidadeDeProvas=0;
        int mediaParcial=0;
        for (int x: testScores) {
            quantidadeDeProvas++;
            mediaParcial = mediaParcial + x;
        }
        int mediaFinal = mediaParcial/quantidadeDeProvas;
        if(mediaFinal>=90 && mediaFinal<=100){
            return 'O';
        }else if(mediaFinal>=80 && mediaFinal<90){
            return 'E';
        }else if(mediaFinal>=70 && mediaFinal<80){
            return 'A';
        }else if (mediaFinal>=55 && mediaFinal<70){
            return 'P';
        }else if(mediaFinal>= 40 && mediaFinal<55){
            return 'D';
        }else {
            return 'T';
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
