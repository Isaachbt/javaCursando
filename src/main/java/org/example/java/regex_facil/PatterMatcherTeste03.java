package regex_facil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTeste03 {
    public static void main(String[] args) {
        //expressão regular e bom quando vc quer extrair uma plv/frase especifica no meio de um texto/arquivo
        //e usado para validação, se o email e valido.
        //esses são os mais basicos metterCaraqueteris:
        // \d = todos os digitos (numeros)
        // \D = mostra tudo oq for letra (exeto numeros)
        // \s = Mostra apenas os espaços em branco que tem no texto
        // \S = Mostra o texto excluindo os espaços em branco, deixa tudo junto
        // \w = Mostra tudo q for a a-ZA-Z, e _, apaga caracteres especiais
        // \W = Mostra caracteres especiais e espacos, apgado numeros e letra
        // [] = ele e usado assim: [abc] dessa forma ele ira procurar no texto se tem a plv a, b ou c, se por assim "abc" ele ira procurar a plv
        String regex = "[ab]";//se vc por aqui "ab" por exemplo ele vai procurar todos ab do texto
        String texto = "abaixei uau9b9";//texto de exemplo
        String texto2 = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            //matcher.start(), ele imprime o numero das casa aonde esta as plvs
            //matcher.group(), ele diz oq foi encontrado matcher.group() + matcher.start() diz a posicao e oq foi encontrado
            System.out.print(matcher.start()+" "+matcher.group()+" ");
        }







    }
}
