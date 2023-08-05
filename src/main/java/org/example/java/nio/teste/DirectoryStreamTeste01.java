package org.example.java.nio.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\isaac\\IdeaProjects\\CursoJava\\pasta");// . quer dizer começo de tudo

       //listando todas as pasta, pra listar tem q passar da onde ele vai começar a listar, ele não lista 100% de tudo
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
         for ( Path path: stream){
             System.out.println(path.getFileName());
         }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
