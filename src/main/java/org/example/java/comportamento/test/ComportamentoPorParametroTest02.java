package org.example.java.comportamento.test;;

import org.example.java.comportamento.dominio.Car;
import org.example.java.comportamento.interfac.CarPredicate;

import java.util.ArrayList;
import java.util.List;
public class ComportamentoPorParametroTest02 {
    //filtando dados de uma List<>
    private static  List<Car> list = List.of(
    new Car("Preto",2010),new Car("Azul",2018),new Car("Azul",1990),new Car("Roxo",2022));
    public static void main(String[] args) {

        //utilizando class anonimas para evitar muitos codigos
        List<Car> filterCar = filter(list, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Azul");
            }
        });

        System.out.println(filterCar);

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate)
    {
        List<Car> filteredCar = new ArrayList<>();
        for(Car car: cars)
        {
            if (carPredicate.test(car))
            {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}
