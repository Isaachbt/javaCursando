package genericos.test;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args)
    {
        List<Cachorro> cachorroList = List.of(new Cachorro(),new Cachorro());
        List<Gato> gatoList = List.of(new Gato(),new Gato());

        printConsulta(cachorroList);
        printConsulta(gatoList);


        List<Animal> list = new ArrayList<>();
        printConsultaAnimal(list);
    }

    //type erasure ? extend; quer dizer q td q extende animal pode ser passado, sempre sera <extend>
    //c baixo, filhos..
    private static void printConsulta(List<? extends Animal> animals)
    {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }

    //recebe um tipo q esta na list<> ou pai desse Cachorro tipo: Object ou Animal
    //nivel hierarquico pra cima, pai...
    private static void printConsultaAnimal(List<? super Cachorro> list)
    {
        //Object e o nivel maximo, ent sempre será ele a ser passado aqui
        for (Object o: list)
        {

        }
    }
            
}
