package exercao.exercao.teste;

import java.io.File;
import java.io.IOException;

public class MainExercao2 {
    public static void main(String[] args) {

    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");

        try{
            file.createNewFile();
        }catch (IOException e){

        }
    }
}
