package org.example.java.colecoes.teste;

import org.example.java.colecoes.dominio.Consumidor;
import org.example.java.colecoes.dominio.Manga;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        //simulando uma compra de manga, utilizando um cliente, chave cliente e valor manga
        Consumidor c1 = new Consumidor("Isaac");
        Consumidor c2 = new Consumidor("Net");

        Manga manga1 = new Manga(5L, "kaguya-sama", 20.0);
        Manga manga2 = new Manga(2L, "Dr. Stone", 90.0);
        Manga manga3 = new Manga(1L, "Black clover", 80.90);
        Manga manga4 = new Manga(3L, "Attack on titan", 10.11);
        Manga manga5 = new Manga(4L, "Pokemon", 5.90);


        Map<Consumidor,Manga> map = new LinkedHashMap<>();

        map.put(c1,manga1);
        map.put(c2,manga2);


        for (Map.Entry<Consumidor,Manga> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }
}
