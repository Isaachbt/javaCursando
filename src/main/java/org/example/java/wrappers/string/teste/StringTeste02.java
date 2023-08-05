package wrappers.string.teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "isaac";
        String numeros = "12345";

        System.out.println(nome.length());//mostra o tamanho da string

        System.out.println(nome.replace("i","l"));//vai trocar todos os i por l, pode ser outra letra

        System.out.println(numeros.substring(0,2));

        System.out.println(nome.trim());//remove os espacos nas frases
    }
}
