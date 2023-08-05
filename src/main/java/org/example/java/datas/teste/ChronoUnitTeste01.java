package org.example.java.datas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    //ChronoUnit e otima para intervalo de datas
    public static void main(String[] args) {
        LocalDateTime aniv = LocalDateTime.of(1999, Month.AUGUST,3,4,9,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniv,now));//diz quantos dias se passou desde tal data
        System.out.println(ChronoUnit.WEEKS.between(aniv,now));//diz quantas semanas tem tal data, aniversario por exemplo
        System.out.println(ChronoUnit.MONTHS.between(aniv,now)); // diz quantos meses ja se passou em determinada data
        System.out.println(ChronoUnit.YEARS.between(aniv,now)); // diz quantos anos ja se passou em determinada data
    }
}
