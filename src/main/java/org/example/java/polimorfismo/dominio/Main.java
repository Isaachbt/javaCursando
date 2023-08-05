package org.example.java.polimorfismo.dominio;

import org.example.java.polimorfismo.model.Computador;
import org.example.java.polimorfismo.model.Televisao;
import org.example.java.polimorfismo.model.Tomate;
import org.example.java.polimorfismo.servico.CalculadoraImposto;


public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador("Pocktei9",190000);
        Tomate tomate = new Tomate("Tomate vermelho", 5);
        Televisao televisao = new Televisao("Lg 50\" ",5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
