package colecoes.teste;

import colecoes.dominio.Manga;
import colecoes.dominio.Smartphone;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"kaguya-sama",20.0,0));
        mangas.add(new Manga(2L,"Dr. Stone",90.0,0));
        mangas.add(new Manga(1L,"Black clover",80.90,0));
        mangas.add(new Manga(3L,"Attack on titan",10.11,1));
        mangas.add(new Manga(4L,"Pokemon",5.90,2));
        mangas.add(new Manga(6L,"Dragon ball z",9.0,3));



        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
