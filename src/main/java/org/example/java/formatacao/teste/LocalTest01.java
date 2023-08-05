package org.example.java.formatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        //essa class serve para formatar datas e moedas
        // pt-BR
        //define os paises
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeInfia = new Locale("hi","IN");
        Locale localeJapao = new Locale("ja","JP");
        Locale localeHolanda = new Locale("nl","NL");

        Calendar calendar = Calendar.getInstance();
        //mostra a data em letras
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeInfia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeHolanda);
        System.out.println("Italia "+df1.format(calendar.getTime()));
        System.out.println("Suica "+df2.format(calendar.getTime()));
        System.out.println("India "+df3.format(calendar.getTime()));
        System.out.println("Japao "+df4.format(calendar.getTime()));
        System.out.println("Holanda "+df5.format(calendar.getTime()));

        //diz o nome do pais pela localidade definida
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
        //aqui ele diz como se fala o nome do pais difinido com outra lingua
        System.out.println(localeCH.getDisplayLanguage(localeHolanda));
    }
}
