package genericos.test;

import genericos.dominio.Barco;
import genericos.dominio.Carro;
import genericos.service.CarroRentavelService;
import genericos.service.RentalService;

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
