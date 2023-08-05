package resourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en_US"));
        boolean isaac = bundle.containsKey("isaac");//aqui ele verifica se tem esse texto passado dentro do arquivo, se não retorna false
        System.out.println(bundle.getString("hello"));//pegando o valor salvo no aquivo, tem q passar a chave

        bundle = ResourceBundle.getBundle("message", new Locale("pt_BR"));
        System.out.println(bundle.getString("hello"));

        //Locale("fr","CA");
        //O java vai procurar o aquivo salvo, se ele não achar ele vai usar a sua lingua padrão

        //message.properties e o base, se vc tiver varias plvs iguais a outras linguas, pode usar a base
    }
}
