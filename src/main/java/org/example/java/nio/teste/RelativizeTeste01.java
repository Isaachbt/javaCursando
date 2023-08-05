package nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTeste01 {
    public static void main(String[] args) {
        //nessa class ensina como mover entre Paths

        Path dir = Paths.get("/home/isaac");
        Path clazz = Paths.get("/home/isaac/projetotop/File.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/isaac");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/isaac/projetotop/File.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.439403490");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("5 " + relativo1.relativize(relativo2));

    }
}
