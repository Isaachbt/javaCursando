package org.example.java.jdbc.test;

import org.example.java.jdbc.dominio.PessoaBd;
import org.example.java.jdbc.services.PessoaServices;

import java.util.Scanner;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        PessoaBd ps = PessoaBd.builder().
                name("Isaac lima").
                cpf("234245564").
                id(3).
                build();
        //PessoaServices.showTypeScrollWorking();

        PessoaServices.showPessoaMetaData();



        //usando build
        //PessoaServices.save(ps);
        // PessoaServices.delete(5);
        //PessoaServices.update(ps);
        //System.out.println(PessoaServices.selectAll());
        //System.out.println(PessoaServices.searchName("t"));


        //inicio();

    }

    private static void inicio()
    {
        int op = 0;

        do {
            op = new Scanner(System.in).nextInt();

            System.out.println("1 - Adicionar dados");
            System.out.println("2 - Deletar");
            System.out.println("3 - listar dados");
            System.out.println("4 - Atualizar dados");

            switch (op)
            {
                case 1:
                    adcionarDados();
                    break;
                case 2:
                    deletar();
                    break;
                case 3:
                    PessoaServices.selectAll();
                    break;
            }
        }while (op != 0);
    }

    private static void deletar()
    {
        System.out.println("Digite o id que deseja que seja apagado.");
        int id = new Scanner(System.in).nextInt();
        PessoaServices.delete(id);
    }

    private static void adcionarDados()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu cpf: ");
        String cpf = scanner.next();
        PessoaBd ps = PessoaBd.builder()
                .name(nome)
                .cpf(cpf)
                .build();
        PessoaServices.save(ps);
    }
}
