package colecoes.teste;

import colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        //usando set não sera permitido valores repetido na list
        //utilizando hasSet ele ira trabalhar com o has para organizar as coisas
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
