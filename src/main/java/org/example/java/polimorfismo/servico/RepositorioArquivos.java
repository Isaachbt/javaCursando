package org.example.java.polimorfismo.servico;


import org.example.java.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
