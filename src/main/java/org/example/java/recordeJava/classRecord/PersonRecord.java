package org.example.java.recordeJava.classRecord;

public record PersonRecord(String nome,int idade) {
    //vantagens do Record: cria get e todos os outros (exceto set) hascode,toString,equals.... essa class economiza muito codigo
    //por defoult os parametros são private e final, o set dele e dentro do construtor, ele inicia os dados na hora da criação
    //ela ja inicia com um construtor com argumentos padrão
    //Record e igual uma class normal, oq muda e q ela ja vem com metodos pre prontos, assim evitando ter q criar e poluir a tela, claro q vc pode sobrescrever
    //Record não muda os dados ja add, ele não tem set ent vc so pode usar o msm argumento sempre.
    //não podemos criar String cpf : no corpo do record, so se for String static cpf; e para usar normal so dentro do corpo da class
    //não podemos usar herança e multiplas mas pode usar interfaces

    public void print()
    {

        System.out.println("Nome: "+nome);
    }
}
