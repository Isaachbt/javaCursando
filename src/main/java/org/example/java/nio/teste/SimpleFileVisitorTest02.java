package nio.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
class ListAllFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());

        return FileVisitResult.CONTINUE;//esta falando q e pra continuar listando todas as pastas
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        //esse metodo e chamado quando entra em um diretorio/pasta
        System.out.println("preVisitDirectory: "+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        //esse metodo e chamado quando sai de um diretorio/pasta
        return super.postVisitDirectory(dir, exc);
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }


}


public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("pasta");

        Files.walkFileTree(root,new ListAllFiles());
    }
}
