package exercao.error.teste;

import exercao.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {

        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException{
        //Ele chama a class q extend a LoginInvalidoException e usa ela como execao
        //esse metodo simula uma validacao de login
        Scanner scn = new Scanner(System.in);
        String usernameDb = "isaac";
        String senhaDb = "123";

        System.out.println("Usuario");
        String nomeDigitado = scn.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scn.nextLine();

        if (!usernameDb.equals(nomeDigitado) || !senhaDb.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");

    }
}
