package org.example.java.datas.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();// dessa forma que se usa a class Calendar, ela e abstract ent não usa new

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){//verificando se e domingo ou não
            System.out.println("Domingo e o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));//diz qual dia da semana em numero, tipo quarta em numero
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//diz qual dia do mes em numero
        System.out.println(c.get(Calendar.DAY_OF_YEAR));//diz qual dia do ano em numero, tipo 360
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//diz qual semanda do mes em numero, um mes tem 4 semana, ele diz qual esta

        c.add(Calendar.DAY_OF_MONTH,2);// add mais dias ou mes, dessa forma e possivel aumentar a data
        c.add(Calendar.HOUR,2);//Aumentando a hora do relogio
        c.roll(Calendar.HOUR,2);//Aumentando a hora do relogio sem passar o dia ou a data
        Date date = c.getTime();// Ja q não sei como usar Calendar, essa e uma forma errada de pegar a data atual, usando Date
        System.out.println(date);
    }

}
