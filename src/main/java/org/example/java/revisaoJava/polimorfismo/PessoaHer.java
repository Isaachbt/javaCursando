package org.example.java.revisaoJava.polimorfismo;

import lombok.Getter;

@Getter
public class PessoaHer {

    private final String nome;
    private final int idade;
    private final String documento;

    public PessoaHer(String nome, int idade, String documento) {
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    public void imprimirinfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Documento: "+this.documento);
    }


}
