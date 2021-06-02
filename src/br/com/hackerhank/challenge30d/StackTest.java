package br.com.hackerhank.challenge30d;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        System.out.println(integerStack.empty());
        integerStack.add(8);
        integerStack.add(10);
        integerStack.add(13);
        integerStack.add(15);
        System.out.println(integerStack.empty());
        System.out.println(integerStack.peek());

        System.out.println(integerStack.pop());
        System.out.println(integerStack.peek());

        integerStack.push(45);
        System.out.println(integerStack.peek());

        System.out.println(integerStack.search(8));
    }
}
