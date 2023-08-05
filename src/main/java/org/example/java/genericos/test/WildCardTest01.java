package org.example.java.genericos.test;


abstract class Animal
{
    public abstract void consulta();
}

class Cachorro extends Animal
{
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal
{

    @Override
    public void consulta() {
        System.out.println("Consultando gatinho");
    }
}
public class WildCardTest01 {
    public static void main(String[] args)
    {
    Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
    Gato[] gatoes = {new Gato(),new Gato()};

    printConsulta(cachorros);
    printConsulta(gatoes);

    }
    
    private static void printConsulta(Animal[] animals)
    {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
            
}
