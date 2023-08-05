package serializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -5135053585074275398L;// clicar ctrl + shift + a, pesquisar Serializable (serialVersionUID)
                                                                       // e ativar, estando dentro da class desejada
    private Long id;
    private String nome;
    private transient String senha;
    //transient = significa q não e pra serializar
    private transient Turma turma;
    private static String nomeEscola = "sla mano";
    public Aluno(Long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos)
    {
        //dessa forma ele salva não a class q vem de forma ex: Turma, mas sim a string q ele recupera da class Turma
        //turma.getNome() retorna uma string ou int... Ele pega o valor e salva. a class não e serializada! mas sim o valor.
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois)
    {
        //recuperando o valor salvo, tem q recuperar na msm sequencia q salvou.
        try {
          ois.defaultReadObject();
          String nomeTurma = ois.readUTF();
          turma = new Turma(nomeTurma);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
