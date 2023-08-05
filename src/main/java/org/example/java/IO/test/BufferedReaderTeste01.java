package org.example.java.IO.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTeste01 {
    public static void main(String[] args) {
        //BufferedReader ele ler os dados do arquivo de uma forma melhorada, muito mais eficiente e com menos codigos

        File file = new File("isaac.txt");
        try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null){//tem q verificar pra quando chegar na ultima linha, o while faça o BufferedReader parar
                System.out.println(linha);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
