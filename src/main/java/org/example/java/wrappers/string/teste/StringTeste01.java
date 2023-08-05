package wrappers.string.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "isaac";// String constant pool
        String nome2 = "isaac";

        nome = nome.concat(" lima");
        System.out.println(nome == nome2);
    }
}
