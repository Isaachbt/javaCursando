package org.example.java.revisaoJava.polimorfismo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Informações paciente: ");
        PessoaHer p = new Paciente("f43fjlsd","Unimed","Isaac",21,"43565764767");
        p.imprimirinfo();

        System.out.println("Informações do infermeiro: ");
        PessoaHer p2 = new Enfermeiro(12,"TI","re564tr","Isaac",21,"56546546345654");
        p2.imprimirinfo();
    }
}
