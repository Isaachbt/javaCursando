package org.example.java.wrappers.string.teste;

public class StringPerformaceTeste {
    public static void main(String[] args) {

        System.out.println("0 - 100000");
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String ("+(fim - inicio)+"ms)");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder ("+(fim - inicio)+"ms)");

        inicio = System.currentTimeMillis();
        concatStringBuffer(10000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer ("+(fim - inicio)+"ms)");

    }
    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0;i<tamanho;i++){
            texto += i;
        }

    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0;i<tamanho;i++){
           sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        //StringBuffer serve para quando se tem varias threads buscando o msm dado
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0;i<tamanho;i++){
            sb.append(i);
        }
    }
}
