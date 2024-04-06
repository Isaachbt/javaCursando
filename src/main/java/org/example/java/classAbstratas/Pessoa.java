package org.example.java.classAbstratas;
///Class abstract são templates mostrando como tem que ser feito, eles são feitos para ser extendidas por outras class
//Metodos abstract são templates feitos para serem sobrescristo, eles não podem ter corpo, tipo as chaves {}
//o bom de usar class abstract e q vc pode usar elas como exemplos de como tem q ser as coisas
//class abstract podem ter metodos abstract e não abstract
//class não abstract não pode ter metodos abstract
public abstract class Pessoa {
     private String nome;
     private int idade;
    //quando vc extend uma class abstract em outra class abstract, pode! mais se a outra class abstract
    //tiver sendo extendida por uma class normal, vc tem que sobrescrever os metodos da primeira
    //class abstract
    //ou vc pode sobrescrever o metodo na segunda class abstract e ela ira mostrar para todos

    public abstract void imprime();

}
