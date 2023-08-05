package org.example.java.colecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id,"ID não pode ser null");
        Objects.requireNonNull(nome,"NOME não pode ser null");//dessa forma vc garante q a variavel colocada ali dentro, não sera null, se for ele da um erro.
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga o) {
        //regrinha para ordenar os ids menor ate o maior
        /*if (this.id < o.getId()) {
            return -1;
        }else if (this.id.equals(o.getId())){
            return 0;
        }else {
            return 1;
        }*/

        /*outra forma de ordenar maior menor obj, so não pode ser usada com tipos primitovos, doubo = valor
        return this.id.compareTo(o.getId());
        */

        //dessa forma q vc ordena menor maior com valores doublo float: Double.compare(preco, o.getPreco());
        //dessa forma vc ordena em ordem alfabetica uma string em um obj: return this.nome.compareTo(o.getNome());

        return this.id.compareTo(o.getId());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
