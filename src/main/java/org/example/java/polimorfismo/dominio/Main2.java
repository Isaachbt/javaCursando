package polimorfismo.dominio;

import polimorfismo.model.Computador;
import polimorfismo.model.Produto;
import polimorfismo.model.Tomate;

public class Main2 {
    public static void main(String[] args) {
        Produto produto = new Computador("Acer spire 5",37000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImpostos());
        System.out.println("-----------------------------");
        Produto produto2 = new Tomate("Tomate vermelho",10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImpostos());
    }
}
