package br.com.hackerhank.challenge30d.day19.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

public class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        for (int x : list) {
            sum = sum + x;
        }
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n >= 1 && n <= 100) {
            AdvancedArithmetic myCalculator = new Calculator();
            int sum = myCalculator.divisorSum(n);
            System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
            System.out.println(sum);
        }
    }

}
