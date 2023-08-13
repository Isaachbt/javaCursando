package org.example.java.testes.recordeJava;

import org.example.java.testes.recordeJava.classNormal.PersonClass;
import org.example.java.testes.recordeJava.classRecord.PersonRecord;

public class Main {
    public static void main(String[] args) {

        var personClass = new PersonClass("Isaac",20);

        var personRecord = new PersonRecord("Janete",50);

        personRecord.print();
    }
}
