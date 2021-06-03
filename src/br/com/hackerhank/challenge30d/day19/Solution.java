package br.com.hackerhank.challenge30d.day19;

public class Solution {
    public static void print(Poligono p) {
        System.out.println("A " + p.getClass().getSimpleName() + " has " + p.getNumerodeLados() + " sides.");
        System.out.println("The perimeter of this shape is: " + p.getPerimetro() + '\n');
    }

    public static void main(String[] args) {
        Poligono triangle = new Triangulo(1, 2, 3);
        print(triangle);

        Poligono rectangle = new Retangulo(2, 3);
        print(rectangle);

        Poligono square = new Quadrado(2);
        print(square);

    }
}

