package org.example.java.datas.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstanteTeste01 {
    //Instante trab com nanesegundos
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());// representa o nanosegundo do segundo
    }
}
