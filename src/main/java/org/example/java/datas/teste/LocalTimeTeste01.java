package datas.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {

        LocalTime.of(23,32,12);//caso for criar de uma data especifica
        LocalTime localTimeNow = LocalTime.now();//esse ele pega a hora atual
        System.out.println(localTimeNow);
        System.out.println(localTimeNow.getHour());//aqui ele mostra as horas
        System.out.println(localTimeNow.getMinute());//aqui ele mostra os minutos
        System.out.println(localTimeNow.getSecond());//aqui ele mostra os segundos
        System.out.println(localTimeNow.get(ChronoField.HOUR_OF_DAY));//aqui ele mostra


    }
}
