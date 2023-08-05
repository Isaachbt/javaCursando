package comportamento.test;

import comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    //filtando dados de uma List<>
    private static  List<Car> list = List.of(
    new Car("Preto",2010),new Car("Azul",2018),new Car("Azul",1990),new Car("Roxo",2022));
    public static void main(String[] args) {
        String color = "Azul";
        System.out.println(filterCarByColor(list,color));

    }
    private static List<Car> filterAzulCar(List<Car> cars)
    {
        List<Car> azulCar = new ArrayList<>();
        for(Car car: cars)
        {
            if (car.getColor().equals("Azul"))
            {
                azulCar.add(car);
            }
        }
        return azulCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars,String color)
    {
        List<Car> azulCar = new ArrayList<>();
        for(Car car: cars)
        {
            if (car.getColor().equals(color))
            {
                azulCar.add(car);
            }
        }
        return azulCar;
    }
}
