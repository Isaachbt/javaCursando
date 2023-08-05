package IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {

        File file = new File("isaac.txt");
        try(FileReader fr = new FileReader(file)) {
            file.delete();
            char[] in = new char[150];
            //            fr.read(in);
//            for (char c : in){
//                System.out.print(c);
//            }
            int i;
            //aquivo ele esta lendo todo o arquivo de uma vez
            while((i=fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {

        }
    }
}
