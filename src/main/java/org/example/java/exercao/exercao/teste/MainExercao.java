package org.example.java.exercao.exercao.teste;

import java.io.File;
import java.io.IOException;

public class MainExercao {
    public static void main(String[] args) {

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");

        try{
            file.createNewFile();
        }catch (IOException e){

        }
    }
}
