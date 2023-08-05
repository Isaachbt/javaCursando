package exercao.dominio;

//toda class q trata Exception deve ter Exception no final do nome
public class LoginInvalidoException extends Exception{
//estou criando uma class para tratar execao personalizada


    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
