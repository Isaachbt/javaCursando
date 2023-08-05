package polimorfismo.dominio;

import polimorfismo.model.Computador;
import polimorfismo.model.Produto;
import polimorfismo.model.Tomate;

public class Main3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Acer spire 5",37000);
        Produto produto2 = new Tomate("Tomate vermelho",5);

    }
}
