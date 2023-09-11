package org.example.java.recordeJava;

import org.example.java.recordeJava.classNormal.PersonClass;
import org.example.java.recordeJava.classRecord.PersonRecord;

public class Main {
    public static void main(String[] args) {

        var personClass = new PersonClass("Isaac",20);

        var personRecord = new PersonRecord("Janete",50);

        personRecord.print();
    }
}
