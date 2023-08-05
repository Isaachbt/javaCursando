package org.example.java.colecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        //A regra da Queue<> e assim: o primeiro a entrar sera o primeiro a sair
        //Ela foi criada para vc trabalhar com prioridades customizadas
        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("B");
        fila.add("A");
        fila.add("C");
        fila.add("X");
        fila.add("J");


        for (String s:fila)
        {
            System.out.println(s);
        }


    }
}
