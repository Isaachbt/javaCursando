package org.example.java.classAbstratas;

public class Funcionario extends Pessoa{

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {

        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public void calcularBonus()
    {
        this.salario = this.salario + salario * 0.1;
    }

    @Override
    public void imprime() {

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
