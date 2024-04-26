package org.example.java.estrutura_dados_e_algoritimos.teste;

import org.example.java.estrutura_dados_e_algoritimos.estruturadados.Contato;
import org.example.java.estrutura_dados_e_algoritimos.estruturadados.VetorGeneralizar;

public class J_GeneralizarVetor10 {
    public static void main(String[] args) {
        VetorGeneralizar vetor = new VetorGeneralizar(3);

        Contato c1 = new Contato("Isaac","1112334354","isaac@gmail.com");
        Contato c2 = new Contato("net","1134535454","net@gmail.com");
        Contato c3 = new Contato("ester","43543543454","ester@gmail.com");


        Contato c4 = new Contato("ester","43543543454","ester@gmail.com");
        //esse não esta no vetor, mas ele tem os msm dados de um q esta no vetor o c3, ent com equals ele confirmou q e igual.

        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);

        System.out.println("Tamanho = "+vetor.tamanho());
        System.out.println(vetor);

        int pos = vetor.busca(c4);
        if (pos >-1){
            System.out.println("Elemento existe");
        }else{
            System.out.println("Elemento não existe");
        }
    }
}
