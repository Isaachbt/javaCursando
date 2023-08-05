package classAbstratas;

///Class abstract são templates mostrando como tem que ser feito, eles são feitos para ser extendidas por outras class
//Metodos abstract são templates feitos para serem sobrescristo, eles não podem ter corpo, tipo as chaves {}
//o bom de usar class abstract e q vc pode usar elas como exemplos de como tem q ser as coisas
//class abstract podem ter metodos abstract e não abstract
//class não abstract não pode ter metodos abstract
public abstract class Funcionario extends Pessoa{

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
