package polimorfismo.dominio;

import polimorfismo.repositorio.Repositorio;
import polimorfismo.servico.RepositorioArquivos;
import polimorfismo.servico.RepositorioBancoDeDados;
import polimorfismo.servico.RepositorioMemoria;

public class MainRepositorio {
    public static void main(String[] args) {
        /*Se vc tem varias class implementando uma interface, da pra vc usar a interface para instanciar a class tipo:
        RepositorioMemoria re = new RepositorioMemoria(); vc pode trocar pra isso: Repositorio re = new RepositorioMemoria();
        Repositorio bancoDados = new RepositorioBancoDeDados();
        bancoDados.salvar();
        Repositorio arquivos = new RepositorioArquivos();
        arquivos.salvar();
        Repositorio memoria = new RepositorioMemoria();
        memoria.salvar();
        */


    }
}
