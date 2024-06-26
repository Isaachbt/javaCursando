package org.example.java.colecoes.dominio;

import lombok.ToString;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

@ToString
public class Consumidor {
    private Long id;
    private String nome;

    public Consumidor(String nome) {
        this.id = ThreadLocalRandom.current().nextLong();//e bom usar isso, assim ele gera ids longos, bem dificil repetir
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
