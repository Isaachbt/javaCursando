package genericos.service;

import java.util.List;

public class RentalService<T> {

    private List<T> objetosDisponiveis;
    public RentalService(List<T> list)
    {
        this.objetosDisponiveis = list;
    }

    public T buscarObjetosDisponivel()
    {
        System.out.println("Buscando objetos disponivel...");
        T tipo = objetosDisponiveis.remove(0);
        System.out.println("Alugando objetos: "+ tipo);
        System.out.println("objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return tipo;
    }

    public void retornarObjetosAlugadoa(T tipo)
    {
        System.out.println("Devolvendo objetos "+ tipo);
        objetosDisponiveis.add(tipo);
        System.out.println("objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);

    }
}
