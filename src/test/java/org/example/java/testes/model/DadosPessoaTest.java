package org.example.java.testes.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadosPessoaTest {

    private DadosPessoa dadosPessoa;
    private DadosPessoa notAdult;

    @BeforeEach
    public void setUp(){
        //esse metodo serve para voce inicializar todos os dados antes do teste, assim evitando repetir class
        dadosPessoa = new DadosPessoa();
        notAdult = new DadosPessoa();

    }
    @Test
    void camposAgeNameNotIsVazio() {
        assertTrue(dadosPessoa.validarInfos("",20));
    }

    @Test
    void validAgeMore18() {
        assertTrue(notAdult.validarInfos("Isaac",20));
    }
}