package br.com.hackerhank.challenge30d.day19;

public class Retangulo implements Poligono{
    private static int numeroDelados = 4;
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public int getNumerodeLados() {
        return this.numeroDelados;
    }

    @Override
    public double getPerimetro() {
        return lado1+lado1+lado2+lado2;
    }
}
