package formatacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] rfa = new NumberFormat[4];
        rfa[0] = NumberFormat.getInstance();
        rfa[1] = NumberFormat.getInstance(localeBR);
        rfa[2] = NumberFormat.getInstance(localeJp);
        rfa[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_000.2300;

      for (NumberFormat numberFormat:rfa){

          System.out.println(numberFormat.format(valor));
      }
    }
}
