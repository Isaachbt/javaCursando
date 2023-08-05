package polimorfismo.servico;

import polimorfismo.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
