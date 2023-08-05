package org.example.java.comportamento.test;

import org.example.java.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    //filtando dados de uma List<>
    private static  List<Car> list = List.of(
    new Car("Preto",2010),new Car("Azul",2018),new Car("Azul",1990),new Car("Roxo",2022));
    public static void main(String[] args) {

        List<Car> filtar1 = filter(list,car -> car.getColor().equals("Azul"));
        List<Car> filtar2 = filter(list,car -> car.getYear() > 2011);

        System.out.println(filtar1);
        System.out.println(filtar2);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate)
    {
        //Predicate e uma interface criada pra validar ao comparar as coisas
        //metodo generico, otima forma de usar evitando muito codigo
        List<T> filterList = new ArrayList<>();
        for (T t: list)
        {
            if (predicate.test(t))
            {
                filterList.add(t);
            }
        }
        return filterList;
    }

}
