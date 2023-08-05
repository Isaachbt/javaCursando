package org.example.java.interfaces;

public class DataBaseLoader implements DataLoad,DataRemove{
    @Override
    public void loader() {
        System.out.println("Ola mundo....");
    }

    @Override
    public void remove() {

    }
}
