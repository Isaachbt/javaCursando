package datas.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTeste01 {
    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();//assim ele busca a data atual
        System.out.println(localDate.getYear());//diz o ano 2022
        System.out.println(localDate.getMonth());//diz o mes: janeiro
        System.out.println(localDate.getMonthValue());//diz em qual mes estamos, 1/12 mes
        System.out.println(localDate.getDayOfWeek());// diz o dia da semana, quinta feira
        System.out.println(localDate.getDayOfMonth());// diz o dia do mes: 27
        System.out.println(localDate.lengthOfMonth());// diz se o mes e de 30 ou 31
        System.out.println(localDate.isLeapYear());//diz se o ano e 360 ou não
        System.out.println(localDate.get(ChronoField.YEAR));//diz o ano 2022
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));//diz o dia do mes: 27
        System.out.println(localDate);// diz a data completa: 2022-01-27


        //vou criar uma data juntando tudo

        String dia = String.valueOf(localDate.getDayOfMonth());
        String mes = String.valueOf(localDate.getMonthValue());
        String ano = String.valueOf(localDate.getYear());
        System.out.println(dia+"/"+mes+"/"+ano);


    }
}
