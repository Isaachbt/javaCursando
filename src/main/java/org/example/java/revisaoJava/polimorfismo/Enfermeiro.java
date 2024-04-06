package org.example.java.revisaoJava.polimorfismo;

public class Enfermeiro extends PessoaHer{

    private int horaTrabalho;
    private String setor;
    private String numeroCadastro;

    public Enfermeiro(int horaTrabalho, String setor, String numeroCadastro,String nome,int idade,String documento) {
        super(nome,idade,documento);
        this.horaTrabalho = horaTrabalho;
        this.setor = setor;
        this.numeroCadastro = numeroCadastro;
    }

    @Override
    public void imprimirinfo() {
        super.imprimirinfo();
        System.out.println("Hora de Trabalho: "+this.horaTrabalho);
        System.out.println("Recepecão: "+this.setor);
        System.out.println("Numero de cadastro: "+this.numeroCadastro);
    }
}
