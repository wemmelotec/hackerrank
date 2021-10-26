package br.com.hackerhank.challenges;

import java.util.Scanner;
//Java Static Initializer Block
public class Challenge10 {

     static int B, H;
     static boolean flag = true;
     static {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth of the Parallelogram: ");
        B = sc.nextInt();
        System.out.print("Enter the height of the Parallelogram: ");
        H = sc.nextInt();
        sc.close();
        try {
            if (B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

    }

    public static void main(String[] args) {

        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
