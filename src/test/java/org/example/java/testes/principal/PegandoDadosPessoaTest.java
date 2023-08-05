package org.example.java.testes.principal;

import org.example.java.testes.model.DadosPessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PegandoDadosPessoaTest {

    @Test
    void main() {

        int idade = 10;
        String nome = "Isaac";

        if (!nome.isEmpty() && !(idade <10))
        {
            DadosPessoa.validarInfos(nome,idade);
        }else fail();
    }
}