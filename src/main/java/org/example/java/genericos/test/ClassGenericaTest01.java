package org.example.java.genericos.test;


import org.example.java.genericos.dominio.Carro;
import org.example.java.genericos.service.CarroRentavelService;

public class ClassGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRent = new CarroRentavelService();
        Carro carro = carroRent.buscarCarroDisponivel();
        System.out.println("Usando carro por um mes...");
        carroRent.retornarCarrosAlugadoa(carro);

    }
}
