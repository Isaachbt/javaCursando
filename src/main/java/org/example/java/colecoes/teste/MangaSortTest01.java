package org.example.java.colecoes.teste;

import org.example.java.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    //dessa forma vc cria uma class e chama ela aonde quiser para ordenar
    //assim vc define aqui como vai ser feito a ordenação e vai fazer efeito em todos os lugares

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
            //ordenando list de objetos (class), implementar na class q for o obj!
            List<Manga> mangas = new ArrayList<>(6);
            mangas.add(new Manga(5L,"kaguya-sama",20.0));
            mangas.add(new Manga(2L,"Dr. Stone",90.0));
            mangas.add(new Manga(1L,"Black clover",80.90));
            mangas.add(new Manga(3L,"Attack on titan",10.11));
            mangas.add(new Manga(4L,"Pokemon",5.90));
            mangas.add(new Manga(6L,"Dragon ball z",9.0));

            for (Manga m:mangas){
                System.out.println(m);
            }
            //ordenando os objetos, pra isso precisa implementar Comparable<> e sobrecrever o metodo.
            //na class eu ativei para ele organizar por alfabeto, mas pode ser por id, ou por qualquer outra variavel
            Collections.sort(mangas);
            System.out.println("-----------------------------------");
            for (Manga m:mangas){
                System.out.println(m);
            }

            //ordenando a list, MangaByIdComparator() ja esta dizendo como q vai ser feito essa ordenação
            //Collections.sort(mangas,new MangaByIdComparator());
            mangas.sort(new MangaByIdComparator());
            System.out.println("-----------------------------------------");
            for (Manga m:mangas){
                System.out.println(m);
            }

    }
}
