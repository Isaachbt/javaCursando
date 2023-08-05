package regex_facil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTeste01 {
    public static void main(String[] args) {
        //expressão regular e bom quando vc quer extrair uma plv/frase especifica no meio de um texto/arquivo
        //e usado para validação, se o email e valido.

        String regex = "ab";//se vc por aqui "ab" por exemplo ele vai procurar todos ab do texto
        String texto = "abaixei um jogo esse jogo era topab tabo";//texto de exemplo
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");//matcher.start(), ele imprime o numero das casa aonde esta as plvs
        }

    }
}
