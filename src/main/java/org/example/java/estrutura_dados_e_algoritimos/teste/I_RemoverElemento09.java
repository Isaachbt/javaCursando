package org.example.java.estrutura_dados_e_algoritimos.teste;

import org.example.java.estrutura_dados_e_algoritimos.estruturadados.Vetor;

public class I_RemoverElemento09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("E");
        vetor.adicionar("F");
        vetor.adicionar("G");

        System.out.println(vetor);

        vetor.removerElemento(1);

        System.out.println(vetor);

        System.out.println("Removendo elemento pela letra escolhida");

        int pos = vetor.busca("e");
        if (pos >= -1){
            vetor.removerElemento(pos);
        }else{
            System.out.println("Elemento não existe");
        }
        System.out.println(vetor);
    }
}
