package org.example.java.colecoes.teste;

import org.example.java.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L,"kaguya-sama",20.0,0));
        mangas.add(new Manga(2L,"Dr. Stone",90.0,0));
        mangas.add(new Manga(1L,"Black clover",80.90,0));
        mangas.add(new Manga(3L,"Attack on titan",10.11,1));
        mangas.add(new Manga(4L,"Pokemon",5.90,2));
        mangas.add(new Manga(6L,"Dragon ball z",9.0,3));

        Iterator<Manga> mangaIterator = mangas.iterator();//Iterator ele olha pra fila pra ver se tem alguem ou proximo obj
        while(mangaIterator.hasNext())
        {
            if (mangaIterator.next().getQuantidade() == 0)//verifica se a quantidade de manga e igual a zero pra remover ele da lista
            {
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

        //mangas.removeIf(manga -> manga.getQuantidade() == 0);//dessa forma ele remove igual em cima em uma linha


    }
}
