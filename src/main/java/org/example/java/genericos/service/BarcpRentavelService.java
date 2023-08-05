package org.example.java.genericos.service;


import org.example.java.genericos.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcpRentavelService {
   private  List<Barco> barcoDisponiveis =
           new ArrayList<>(List.of(new Barco("lancha"),new Barco("iate")));

   public Barco buscarBarcoDisponivel()
   {
       System.out.println("Buscando barcos disponivel...");
       Barco barco = barcoDisponiveis.remove(0);
       System.out.println("Alugando barco: "+barco);
       System.out.println("barcos disponiveis para alugar: ");
       System.out.println(barcoDisponiveis);
       return barco;
   }

   public void retornarBarcosAlugadoa(Barco barco)
   {
       System.out.println("Devolvendo barco "+barco );
       barcoDisponiveis.add(barco);
       System.out.println("barcos disponiveis para alugar: ");
       System.out.println(barcoDisponiveis);

   }

}
