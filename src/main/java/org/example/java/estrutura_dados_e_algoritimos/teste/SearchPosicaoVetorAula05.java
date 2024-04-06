package org.example.java.estrutura_dados_e_algoritimos.teste;

import org.example.java.estrutura_dados_e_algoritimos.estruturadados.Vetor;

public class SearchPosicaoVetorAula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("Elemento 1");
        vetor.adicionar("Elemento 2");
        vetor.adicionar("Elemento 3");

        System.out.println(vetor.busca(2));
    }
}
