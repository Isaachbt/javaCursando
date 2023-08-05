package colecoes.teste;

import colecoes.dominio.Consumidor;
import colecoes.dominio.Manga;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;


public class NavigableMapTest01 {
    public static void main(String[] args) {

        Consumidor c1 = new Consumidor("Isaac");
        Consumidor c2 = new Consumidor("Net");

        // o  NavigableMap<String,String> map = ele ordena pela chave, ent ele ira seguir a sequencia alfabetica ou numerica da chave
        NavigableMap<String,String> map = new TreeMap<>();
        map.put("senha2","123");
        map.put("senha1","123");
        map.put("senha3","123");
        map.put("senha5","123");
        map.put("senha4","123");
        map.put("senha6","123");

        for (Map.Entry<String,String> entry : map.entrySet())
        {
            System.out.println("-----"+entry.getKey());
            System.out.println("-"+entry.getValue());
        }

        System.out.println(map.headMap("senha2").remove("senha1"));
    }
}
