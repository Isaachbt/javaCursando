package org.example.java.polimorfismo.model;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Calcular imposto Televisao");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
