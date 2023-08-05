package org.example.java.nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTeste {
    public static void main(String[] args) {
        String diretorioProjeto = "home/isaac/projeto";//diretorio
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
    }
}

