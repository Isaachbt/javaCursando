package exercao.error.teste;

import exercao.dominio.Funcionario;
import exercao.dominio.Pessoa;

public class SobrescritaComExceptionTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }

}
