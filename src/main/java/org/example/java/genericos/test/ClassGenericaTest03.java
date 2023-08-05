package org.example.java.genericos.test;


import org.example.java.genericos.dominio.Barco;
import org.example.java.genericos.dominio.Carro;
import org.example.java.genericos.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis =
                new ArrayList<>(List.of(new Carro("Mercedez"),new Carro("BMW")));

        List<Barco> barcoDisponiveis =
                new ArrayList<>(List.of(new Barco("lancha"),new Barco("iate")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);

    }
}
