package org.example.java.testes.recordeJava.classNormal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @ToString @EqualsAndHashCode
public class PersonClass {

    private final String nome;
    private final int idade;

    public PersonClass(String nome,int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
}
