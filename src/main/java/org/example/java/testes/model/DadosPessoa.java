package org.example.java.testes.model;

import java.util.Objects;

public class DadosPessoa {


    public boolean validarInfos(String nome, int idade)
    {
        if (idade > 0 && !nome.isEmpty())
        {
            Objects.requireNonNull(nome,"Name can´t be null");
            System.out.print(nome+"/"+idade);
            return true;
        }
        return false;
    }

    public boolean isAdult(int age){
        return age >= 18;
    }
}
