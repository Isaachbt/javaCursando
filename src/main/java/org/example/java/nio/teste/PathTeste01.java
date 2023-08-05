package org.example.java.nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {

        //Todas as formas de buscar uma pasta ou diretorio e arquivo junto
        Path p1 = Paths.get("C:\\Users\\isaac\\IdeaProjects\\CursoJava\\pasta\\arquivo_renomeado.txt");
        Path p2 = Paths.get("C:\\Users\\isaac\\IdeaProjects\\CursoJava\\pasta","arquivo_renomeado.txt");
        Path p3 = Paths.get("C:","Users\\isaac\\IdeaProjects\\CursoJava\\pasta", "arquivo_renomeado.txt");
        Path p4 = Paths.get("C:","Users","isaac","IdeaProjects","CursoJava","pasta","arquivo_renomeado.txt");
        System.out.println(p1.getFileName());//nome do arquivo
        System.out.println(p1.getParent());//diz aonde esta salvo
    }
}
