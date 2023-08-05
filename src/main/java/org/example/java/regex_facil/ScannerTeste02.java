package regex_facil;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {
        String txt = "Levi,Eren,Mikasa,armin,true,200";
        Scanner scanner = new Scanner(txt);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){//aqui ele recupera os numeros
                int i = scanner.nextInt();
                System.out.println("Int "+i);
            }else if(scanner.hasNextBoolean()){//aqui ele recupera se e verdadeiro ou falso
                boolean b = scanner.nextBoolean();
                System.out.println("Boo "+b);
            }else{
                System.out.println(scanner.next());
            }
        }

    }
}
