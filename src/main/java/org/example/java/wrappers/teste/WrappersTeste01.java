package org.example.java.wrappers.teste;

public class WrappersTeste01 {
    public static void main(String[] args) {

        //todas as variaveis primitiva do java
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 1;
        double doubleP = 1;
        char charP = '1';
        boolean booleanP = false;

        //tranformando variaveis para class utilitarias wrappers
        // e so pegar a primeira palavra da variavel e deixar ela em maiusculo
        //ao usar dessa forma, quando vc passa um valor fora do limite da variavel ele da erro, manda trocar

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; //boxing
        Long longW = 1l;
        Float floatW = 1f;
        Double doubleW = 100d;
        Character charW = '1';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");


    }
}
