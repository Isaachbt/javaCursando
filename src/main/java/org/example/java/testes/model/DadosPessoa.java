package org.example.java.testes.model;

public class DadosPessoa {

    public static Boolean validarInfos(String nome,int idade)
    {
        if (idade != 0 && nome != null)
        {
            System.out.print(nome+"/"+idade);
            return true;
        }else  return false;
    }
}
