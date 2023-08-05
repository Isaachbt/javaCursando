package org.example.java.testes.principal;

import org.example.java.testes.model.DadosPessoa;

public class PegandoDadosPessoa {
    public static void main(String[] args) {

        int idade = 10;
        String nome = "Isaac";

        DadosPessoa.validarInfos(nome,idade);
    }
}
