package nio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste02 {//nova forma de usar file
    public static void main(String[] args) {
        Path pastaPath = Paths.get("pasta2");

        try {
            if (Files.notExists(pastaPath)) {//verificando se existe a pasta pra ser criada ou não
                Path pastaDirectory = Files.createDirectory(pastaPath);
            }


            //criando varias pasta uma dentro da outra
            Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");

            //criando arquivo dentro da pasta
            Path subPastaDirectory = Files.createDirectories(subPastaPath);
            Path filePath = Paths.get(subPastaPath.toString(), "isaac.txt");//nova forma de criar files
            if (Files.notExists(filePath)){
            Path filePathCreated = Files.createFile(filePath);
            }

            //renomeando arquivo
            Path origem = filePath;
            Path destino = Paths.get(filePath.getParent().toString(),"Isaac.txt");
            Files.copy(origem,destino);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
