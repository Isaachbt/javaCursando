package org.example.java.jdbc.services;

import org.example.java.jdbc.dominio.PessoaBd;
import org.example.java.jdbc.repository.PessoaRepository;

import java.util.List;

public class PessoaServices {

    public static void save(PessoaBd ps)
    {
        if ((ps.getName() == null) && (ps.getCpf() == null))
        {
            throw new NullPointerException("Dados nao pode ser null");
        }
        PessoaRepository.save(ps);
    }

    public static void delete(Integer id)
    {
       validandoId(id);
        PessoaRepository.delete(id);
    }

    public static void update(PessoaBd ps)
    {
       validandoId(ps.getId());
        PessoaRepository.update(ps);
    }

    public static List<PessoaBd> selectAll()
    {
        return PessoaRepository.select();
    }

    public static List<PessoaBd> searchName(String nome)
    {
        //validandoId(ps.getId());
         return PessoaRepository.searchName(nome);
    }

    public static void showPessoaMetaData()
    {
        PessoaRepository.showPessoaMetaData();
    }

    public static void showTypeScrollWorking()
    {
        PessoaRepository.showTypeScrollWorking();
    }

    public static void showDriverMetaData()
    {
        PessoaRepository.showDriveMetaData();
    }

    private static void validandoId(Integer id)
    {
        if (id == null || id <= 0)
            throw new IllegalArgumentException("valor invalido: "+id);
    }


}
