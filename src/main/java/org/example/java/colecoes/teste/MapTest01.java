package colecoes.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //com o map se vc por duas chaves iguals ela sobrescreve
        //por isso e bom usar putIFabsent("","") ele só add uma chave e valor caso não exista a chave ja criada
        //caso queira deixar a ordem de inserção usa LinkdHashMap<>() em vez de HashMap<>()
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","voce");

        System.out.println(map);


        //tem como navegar via chave e via valor,
        //as chaves tem valores unicos mas os valores não, eles podem ser repetidos pq são valores add

        for (String key : map.keySet()) {
            //pegando apenas as chaves e listando
            System.out.println(key);//listando as chaves
            //listando as chaves e com ela listando os valores juntos
            System.out.println("-"+map.get(key));//recuperando os valores com as chaves
        }

        System.out.println("----------------");

        for (String value : map.values())
        {
            System.out.println(value);//listando apenas os valores
        }

        System.out.println("---------------------");

        for (Map.Entry<String, String> valorKey : map.entrySet())
        {//dessa forma ele recupera chave e valor de uma vez e com apenas um for
            System.out.println(valorKey.getKey() +" : "+valorKey.getValue());
        }
    }

}
