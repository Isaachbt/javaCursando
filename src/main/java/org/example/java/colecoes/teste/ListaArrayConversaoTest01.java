package org.example.java.colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

       Integer[] listToArray = numeros.toArray(new Integer[0]);//convertendo uma list em array
       System.out.println(Arrays.toString(listToArray));

       /*int[] simple = new int[listToArray.length];//recebendo o tamanho do arrayObj
       for (int i = 0;i< simple.length;i++){//passando os dados pra outra array
           simple[i] = listToArray[i];
           System.out.println(simple[i]);
       }
       */

        System.out.println("---------------------------------------------");

       Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;


        //dessa forma ele cria tipo um link entre os a list e o array, não pode add nem mudar valor
        List<Integer> arrayToList = Arrays.asList(numerosArray);


        //dessa forma ele quebra esse link e vc pode add e mudar valor separadamente
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));


    }
}
