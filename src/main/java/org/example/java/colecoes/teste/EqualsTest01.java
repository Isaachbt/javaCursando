package org.example.java.colecoes.teste;


import org.example.java.colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smart1 = new Smartphone("aoneo","moto");
        Smartphone smart2 = new Smartphone("aoneo","moto");
        System.out.println(smart1.equals(smart2));
    }
}
