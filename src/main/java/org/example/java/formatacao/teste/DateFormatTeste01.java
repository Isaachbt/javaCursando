package org.example.java.formatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();//mostra data e hora normal: 31/10/2022 19:14
        df[1] = DateFormat.getDateInstance();// 31 de out. de 2022
        df[2] = DateFormat.getTimeInstance();//mostra a hora: 19:14:36
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);//mostra so a data: 31/10/2022
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);// 31 de out. de 2022
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);// 31 de outubro de 2022
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);// mostra dia, e data: segunda-feira, 31 de outubro de 2022

        for (DateFormat da:df) {
            System.out.println(da.format(calendar.getTime()));

        }
    }
}
