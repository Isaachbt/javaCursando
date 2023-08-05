package org.example.java.interfaces;

public interface DataLoad {

    void loader();

    default void checkPermission()
    {
        //usar um metodo default, faz com que não seja obrigatorio o uso desse metodo nas outrar class
        System.out.println("Fazendo checagem de permissões");
    }
}
