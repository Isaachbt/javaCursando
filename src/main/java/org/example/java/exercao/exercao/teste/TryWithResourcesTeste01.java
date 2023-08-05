package org.example.java.exercao.exercao.teste;


import org.example.java.exercao.dominio.Leitor1;
import org.example.java.exercao.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        //esse codigo mostra try com recurso, tipo um if q pode por algo entre parenteses.

        lerArquivos();
    }

    public static void lerArquivos(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }

    public static void lerArquivos2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {

        }
    }
}
