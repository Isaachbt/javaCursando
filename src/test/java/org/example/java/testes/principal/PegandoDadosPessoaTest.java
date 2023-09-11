package org.example.java.testes.principal;

import org.example.java.testes.model.DadosPessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PegandoDadosPessoaTest {

    @Test
    void camposAgeNameNotIsVazio() {
        DadosPessoa dadosPessoa =  new DadosPessoa();

        assertTrue(dadosPessoa.validarInfos("Isaac",20));

    }
}