package org.example.java.IO.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            /* boolean isDelete = file.delete();//deleta o arquivo */
            boolean isCreated = file.createNewFile();//ele cria um arquivo, ele não sobrescreve o arquivo, ent não ira recriar de novo
            System.out.println("Criado: "+isCreated);
            System.out.println("path: "+file.getPath());//nome do arquivo
            System.out.println("path absoluto: "+file.getAbsolutePath());//diz exatamente aonde esta o arquivo
            System.out.println("E diretorio?: "+file.isDirectory());//diz se e um diretorio
            System.out.println("E file?: "+file.isFile());//diz se e um file
            System.out.println("E hidden/oculto?: "+file.isHidden());//diz se e um arquivo oculto
            System.out.println("Quando foi mod?: "+new Date(file.lastModified()));//diz o dia q foi criado

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
