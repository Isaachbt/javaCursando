package colecoes.teste;

import colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"kaguya-sama",20.0));
        mangas.add(new Manga(2L,"Dr. Stone",90.0));
        mangas.add(new Manga(1L,"Black clover",80.90));
        mangas.add(new Manga(3L,"Attack on titan",10.11));
        mangas.add(new Manga(4L,"Pokemon",5.90));
        mangas.add(new Manga(6L,"Dragon ball Z",9.0));

        //precisa ordenar antes de binarySearch, se for ordenação personalizada tem q passar la tambem

        //Collections.sort(mangas);

        mangas.sort(mangaByIdComparator);

        for (Manga m:mangas){
            System.out.println(m);
        }

        //Armazenando no objeto pra passar em outro local oq vou querer buscar
        Manga mangaToSearch = new Manga(6L,"Dragon ball Z",2.99);

        // dessa forma eu passo a lista = mangas, e depois passo oq eu quero pesquisar mangaToSearch e depois a forma q esta ordenando
        System.out.println(Collections.binarySearch(mangas,mangaToSearch,mangaByIdComparator));//retorna em qual posição esta.


    }
}
