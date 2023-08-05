package colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        //caso ele não encontre vai retornar isso (-(ponto de inserção) -1)
        //as listas tem q ser ordenadas.
        //index 0,1,2,3
        //value 0,2,3,4,

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,2));





    }
}
