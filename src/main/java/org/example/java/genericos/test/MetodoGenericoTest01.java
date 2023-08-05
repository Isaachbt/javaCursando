package genericos.test;

import genericos.dominio.Barco;
import genericos.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {

        criaArrayComUmObjeto(new Barco("Canoa"));


    }

    private static <T> void criaArrayComUmObjeto(T t)
    {
        List<T> list = List.of(t);
        System.out.println(list);

    }
}


