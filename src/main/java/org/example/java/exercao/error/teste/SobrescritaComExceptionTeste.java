package org.example.java.exercao.error.teste;


import org.example.java.exercao.dominio.Funcionario;
import org.example.java.exercao.dominio.Pessoa;

public class SobrescritaComExceptionTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }

}
