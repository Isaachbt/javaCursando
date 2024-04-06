package org.example.java.revisaoJava.polimorfismo;

public class Paciente extends PessoaHer{

    private final String matricula;
    private final String planoDeSaude;

    public Paciente(String matricula, String planoDeSaude,String nome, int idade, String documento) {
        super(nome,idade,documento);
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;
    }

    public void imprimirinfo(){
        super.imprimirinfo();
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Plano de saude: "+this.planoDeSaude);
    }
}
