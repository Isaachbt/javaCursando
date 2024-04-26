package org.example.java.estrutura_dados_e_algoritimos.teste;

import org.example.java.estrutura_dados_e_algoritimos.estruturadados.Vetor;

public class H_AumentarCapacidadeArray08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("E");
        vetor.adicionar("F");
        vetor.adicionar("G");

        System.out.println(vetor);
    }
}
