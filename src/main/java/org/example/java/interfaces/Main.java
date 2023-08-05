package org.example.java.interfaces;

public class Main {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.loader();
        fileLoader.loader();

        fileLoader.checkPermission();
    }
}
