package IO.test;

import java.io.File;
import java.io.IOException;

public class FileTeste02Diretorio {
    //nessa class ensina como criar um diretorio/pasta
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorio = fileDiretorio.mkdir();
        System.out.println(isDiretorio);
        File filaArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        File fileRename = new File(fileDiretorio,"arquivo_renomeado.txt");
        filaArquivoDiretorio.renameTo(fileRename);

            //filaArquivoDiretorio.createNewFile();

    }
}
