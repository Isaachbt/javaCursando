package org.example.java.datas.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(6);//troca o dia do mes
        now = now.withMonth(11);//troca o mes do ano
        now = now.with(ChronoField.DAY_OF_MONTH,6);//troca o dia do mes
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //aqui ele diz que data sera tal dia da semana, tipo, quanda sera quinta-feira? ele diz a data
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        //aqui ele diz quando foi tal dia da semana, tipo, quando foi a ultima segunda-feira? ai ele diz em data
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        //ele diz quando foi o primeiro dia do mes e qual dia da semana foi, exemplo: segunda
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //ele diz se o mes e de 30 ou 31
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //qual sera o primeiro dia do proximo ano
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //diz qual o proximo mes, e qual dia da semana ira ser, exemplo: segunda
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
