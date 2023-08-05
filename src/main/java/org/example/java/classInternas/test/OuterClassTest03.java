package org.example.java.classInternas.test;

public class OuterClassTest03 {
    static class Nested{
       public void print(){}
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
