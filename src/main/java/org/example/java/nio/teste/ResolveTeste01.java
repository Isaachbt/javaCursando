package org.example.java.nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/isaac");
        Path arquivo = Paths.get("projeto/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("home/isaac");
        Path relativo = Paths.get("projeto");
        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));

    }
}
