package org.example.java.exercao.error.teste;

public class StackOverflow {
    public static void main(String[] args) {


            recursividade();//chamar o msm metodo dentro dele msm


    }

    public static void recursividade()
    {
        recursividade();
    }
}
