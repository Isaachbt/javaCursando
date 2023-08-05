package org.example.java.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LisrSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add(" 2 kaguya-sama");
        mangas.add(" 1 Dr. Stone");
        mangas.add("Black clover");
        mangas.add("Attack on titan");
        mangas.add(" 3 Pokemon");
        mangas.add("Dragon ball z");
        //ordenando a list, assim padram Collections.sort(mangas); ela apenas fica modo alfabeto a,b,c,d... se for numero 1,2,3,4...
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(56.21);
        dinheiros.add(1020.31);
        dinheiros.add(10.21);



        for (String manga:mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
