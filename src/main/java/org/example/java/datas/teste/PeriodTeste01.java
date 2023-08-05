package datas.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter = LocalDate.now().plusYears(2).plusDays(7);

        Period p1 = Period.between(now,nowAfter);
        Period p2 = Period.ofWeeks(58);//diz quantos dia tem 58 semana
        Period p3 = Period.ofDays(10);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(now.until(now.plusDays(p2.getDays()), ChronoUnit.MONTHS));//dessa forma ele diz quantos meses tem em tal semanas, 59 por exemplo
        System.out.println(now.until(now.plusDays(p2.getDays()), ChronoUnit.DAYS));//dessa forma ele diz quantos dias tem em tal semanas, 59 por exemplo
    }
}
