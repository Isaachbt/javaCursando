package Hheranca;

public class Aula71HerancaP1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Endereco endereco = new Endereco();

        endereco.setRua("Rua da cegonha");
        endereco.setCep("434949304");

        funcionario.setNome("Isaac lima da silva");
        funcionario.setCpf("345.534.534.55");
        funcionario.setSalario(2000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
