package org.example.java.estrutura_dados_e_algoritimos.teste;

import org.example.java.estrutura_dados_e_algoritimos.estruturadados.Vetor;

public class G_AddValoreindexEspecificoAula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("E");
        vetor.adicionar("F");
        vetor.adicionar("G");

        System.out.println(vetor);

        vetor.adicionar(0,"A");
        System.out.println(vetor);

        vetor.adicionar(3,"D");
        System.out.println(vetor);
        //System.out.println(vetor.busca("Elemento 3"));
    }
}
