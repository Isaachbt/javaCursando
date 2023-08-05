package org.example.java.nio.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFile extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().endsWith(".java")) {//navegando em todas as pastas e mostrando apenas as class, pode ser outras coisas
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;//esta falando q e pra continuar listando todas as pastas
    }


}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        //listando todos os arquivos a partir do ponto definido
        Path root = Paths.get(".");

        Files.walkFileTree(root,new ListJavaFile());
    }
}
