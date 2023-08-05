package org.example.java.wrappers.string.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "isaac";
        nome = nome.concat(" lima");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder();//StringBuilder não e uma string normal, não usa normal
    }
}
