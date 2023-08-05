package org.example.java.classAbstratas;

public abstract class Pessoa {
    //quando vc extend uma class abstract em outra class abstract, pode! mais se a outra class abstract
    //tiver sendo extendida por uma class normal, vc tem que sobrescrever os metodos da primeira
    //class abstract
    //ou vc pode sobrescrever o metodo na segunda class abstract e ela ira mostrar para todos

    public abstract void imprime();

}
