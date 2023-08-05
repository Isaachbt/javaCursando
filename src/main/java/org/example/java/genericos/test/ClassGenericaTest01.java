package genericos.test;

import genericos.dominio.Carro;
import genericos.service.CarroRentavelService;

public class ClassGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRent = new CarroRentavelService();
        Carro carro = carroRent.buscarCarroDisponivel();
        System.out.println("Usando carro por um mes...");
        carroRent.retornarCarrosAlugadoa(carro);

    }
}
