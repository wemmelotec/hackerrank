package br.com.hackerhank.challenge30d.day19;

public class Triangulo implements Poligono{
    private static int numeroDeLados = 3;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    @Override
    public int getNumerodeLados() {
        return numeroDeLados;
    }

    @Override
    public double getPerimetro() {
        return lado1+lado2+lado3;
    }
}
