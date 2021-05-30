package br.com.hackerhank.challenge30d;

import java.util.Scanner;

public class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null) //se o primeiro objeto da linkedlist for vazio insera um novo objeto(nó) a linkedlist com a data informada
            return new Node(data);
        else if(head.next == null){//se o próximo objeto tiver o link null, insira um novo nó
            head.next = new Node(data);
        }
        else{
            insert(head.next,data);
        }


        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null; //objeto do inicio da lista head
        int N = sc.nextInt(); //quantidade de nós que serão inseridos

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
