package org.example.java.colecoes.teste;


import org.example.java.colecoes.dominio.Consumidor;
import org.example.java.colecoes.dominio.Manga;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        //simulando uma compra de manga, utilizando um cliente, chave cliente e valor manga
        Consumidor c1 = new Consumidor("Isaac");
        Consumidor c2 = new Consumidor("Net");



        Manga manga1 = new Manga(5L, "kaguya-sama", 20.0);
        Manga manga2 = new Manga(2L, "Dr. Stone", 90.0);
        Manga manga3 = new Manga(1L, "Black clover", 80.90);
        Manga manga4 = new Manga(3L, "Attack on titan", 10.11);
        Manga manga5 = new Manga(4L, "Pokemon", 5.90);

        List<Manga> listManga = new LinkedList<>();
        listManga.add(manga1);
        listManga.add(manga2);
        listManga.add(manga3);
        
        //uma forma de criar e add dados nas List, uma forma bem simples msm. 
        List<Manga> listManga2 = List.of(manga1,manga5,manga4);


        Map<Consumidor, List<Manga>> map = new LinkedHashMap<>();

        map.put(c1,listManga);
        map.put(c2,List.of(manga1,manga5,manga4));

        for (Map.Entry<Consumidor,List<Manga>> entry: map.entrySet())
        {
            System.out.println("------- "+entry.getKey()+" ");
            //System.out.println(entry.getValue());

            for (Manga manga : entry.getValue())
            {
                System.out.println("Manga: " + manga.getNome());
            }
        }

    }
}
