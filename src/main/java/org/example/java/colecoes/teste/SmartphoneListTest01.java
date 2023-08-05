package colecoes.teste;

import colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone smart1 = new Smartphone("aoneo","moto");
        Smartphone smart2 = new Smartphone("2222","xiome");
        Smartphone smart3 = new Smartphone("3333","Lg");
        List<Smartphone> smart = new ArrayList<>(6);
        smart.add(smart1);
        smart.add(smart2);
        smart.add(smart3);

        for (Smartphone smartphone: smart)
        {
            System.out.println(smartphone);
        }

        //verificando se tem tal dados dentro da lista
        Smartphone smart4 = new Smartphone("aoneo","moto");
        System.out.println(smart.contains(smart4));
        smart.add(0,smart4);//aqui vc esta colocando os dados em uma posição especifica!


    }
}
