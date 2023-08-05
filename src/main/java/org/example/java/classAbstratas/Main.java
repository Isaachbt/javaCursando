package org.example.java.classAbstratas;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Janete", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Isaac lima", 10000);
        System.out.println(desenvolvedor);
    }
}
