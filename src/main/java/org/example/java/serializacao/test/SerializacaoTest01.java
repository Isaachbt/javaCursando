package serializacao.test;

import serializacao.dominio.Aluno;
import serializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        //serializar quer dizer, persistir dados em alguma lugra
        Aluno aluno1 = new Aluno(1L,"Isaac","12345");// tem q por Serializable na class
        Turma turma = new Turma("Eu sou o melhor, sempre sereio melhor q existe nesse mundo!");
        serializar(aluno1);

        desserializar();
    }

    private static void serializar(Aluno aluno){
        //serializando um dado em um arquivo/ tranformando dados de uma class preenchida em um arquivo
        Path path = Paths.get("pasta/Aluno.ser");//criando o arquivo na pasta
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void desserializar(){
        //deserializar um obj serializado em uma class ou String por ex/ tipo convertendo uma list<> em class tudo vai depender do total de dados salvos
        Path path = Paths.get("pasta/Aluno.ser");//criando o arquivo na pasta
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){

            Aluno aluno2 = (Aluno) ois.readObject();// tranformando o obj em uma class para poder ler os dados
            System.out.println(aluno2);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
