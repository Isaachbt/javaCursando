package org.example.java.IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//file = cria arquivos, não otimizada
//fileWriter = Escreve arquivos um pouco mais otimizada
//FileReader = ler arquivos, baixo nivel

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("isaac.txt");

        try(FileWriter fw = new FileWriter(file,true)) {//dessa forma o try com paramentos cria um o arquivo file e depois fecha ele, append quer dizer se vai sobrescrever o txt ou add junto
           fw.write("Isaac lima da silva ira sera, o melhor q existe anote isso! jaja acontece\n");//escrevendo no arquivo
           fw.flush();//encerra forçado
            file.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
