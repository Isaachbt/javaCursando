package regex_facil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTeste04 {
    public static void main(String[] args) {
        //expressão regular é bom quando vc quer extrair uma plv/frase especifica no meio de um texto/arquivo
        //É usado para validação, se o email e valido.
        //Esses são os mais basicos mettercaracteres:
        //==============================================
        // \d = todos os digitos (numeros)
        // \D = mostra tudo oq for letra (exceto numeros)
        // \s = Mostra apenas os espaços em branco que tem no texto
        // \S = Mostra o texto excluindo os espaços em branco, deixa tudo junto
        // \w = Mostra tudo q for de a-zA-Z, e _, apaga caracteres especiais
        // \W = Mostra caracteres especiais e espacos, apgado numeros e letra
        // [] = ele e usado assim: [abc] dessa forma ele ira procurar no texto se tem a plv a, b ou c, se por assim "abc" ele ira procurar a plv
        // ? = zero ou uma
        // * = zero ou mais
        // + = zero ou mais
        // {n,m} = de n até m
        // () = agrupamento
        // | = ele ira procurar plvs q sem assim: o(v|c)o ele vai procura plvs q seja ou ovo | ou oco
        // $ = representa o fim da linha
        // . 1.2 = 123, 133, 122, 1@3, 1A3

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
