package IO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("isaac.txt");

        try(FileWriter fw = new FileWriter(file,true); BufferedWriter br = new BufferedWriter(fw)) {//dessa forma o try com paramentos cria um o arquivo file e depois fecha ele, append quer dizer se vai sobrescrever o txt ou add junto
            br.write("Isaac lima da silva ira sera, o melhor q existe anote isso! jaja acontece\n");//escrevendo no arquivo
            br.newLine();//pula uma linha automaticamente, e melhor q usar \n nem todos sistema aceita \n
            br.flush();//encerra forçado
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
