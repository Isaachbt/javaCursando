package org.example.java.formatacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatMoedaTeste02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] rfa = new NumberFormat[4];
        rfa[0] = NumberFormat.getCurrencyInstance();//Ele diz o valor do pais, não precisa difinir.
        rfa[1] = NumberFormat.getCurrencyInstance(localeBR);//ele busca o valor difinido
        rfa[2] = NumberFormat.getCurrencyInstance(localeJp);
        rfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 10_0000.2300;

      for(NumberFormat numberFormat:rfa){
          System.out.println(numberFormat.format(valor));
      }
    }
}
