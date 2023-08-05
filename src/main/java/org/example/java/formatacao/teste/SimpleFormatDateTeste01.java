package formatacao.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFormatDateTeste01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date()));//essas e a forma mais simples de pegar a data do dia atual;
    }
}
