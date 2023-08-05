package colecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

         /*
        List nomes = new ArrayList();// assim era feito ate a versão 1.4
        nomes.add("isaac");
        nomes.add("net");
        for (Object nome: nomes)
        {
            System.out.println(nome);
        }
        */

        List<String> nomes = new ArrayList();
        nomes.add("isaac");
        nomes.add("net");

        nomes.remove(1);
        for (String nome: nomes)
        {
            System.out.println(nome);
        }

        System.out.println("-----------------");

        nomes.add("Suellen");

        for (int i = 0;i< nomes.size();i++)
        {
            System.out.println(i+1+":"+nomes.get(i));
        }
    }
}
