package org.example.java.nio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");

        if (Files.notExists(path)) Files.createFile(path);

        /*
        //Ocultando arquivo e definindo leitura
            Files.setAttribute(path, "dos:hidden", true);//dessa forma esconde o arquivo q foi criado
                                                                      // o usuario so ve se ativar arquivos ocultos
            Files.setAttribute(path, "dos:readonly", true);//Apenas leitura nesse arquivo.

        //desocutando e pode fazer edição
        Files.setAttribute(path, "dos:hidden", false);//agr o usuario pode ver o arquivo
        Files.setAttribute(path, "dos:readonly", false);//pode fazer edição
*/

        //verificando se o arquivo e leitura ou oculto
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());//ve se esta oculto
        System.out.println(dosFileAttributes.isReadOnly());//ve se e somente leitura


        //dessa forma ele ativa se o arquivo vai ser oculto ou não ou se e somente leitura
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);// oculto = true /visivel = false
        fileAttributeView.setReadOnly(true);// leitura = true /escrita = false

        System.out.println(fileAttributeView.readAttributes().isHidden());//ve se esta oculto
        System.out.println(fileAttributeView.readAttributes().isReadOnly());//ve se e somente leitura

    }
}
