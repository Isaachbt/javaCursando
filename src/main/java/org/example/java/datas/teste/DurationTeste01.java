package datas.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class DurationTeste01 {
    //a class Duration ela trab em dizer quanto tempo passou entre tanto tempo, quantos minutos passou de 2021 ate 2022
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter = LocalDateTime.now().plusYears(2);
        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime timeMInus7Hours = LocalDateTime.now().minusHours(7);
        Duration duration = Duration.between(now,nowAfter);
        Duration duratio2 = Duration.between(timeNow,timeMInus7Hours);
        Duration duratio3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));
        Duration durationDay = Duration.ofDays(20);//ele diz quantas horas se passa em dias.
        Duration durationMin = Duration.ofMinutes(20);//ele diz quantos minutos se passa.
        System.out.println(duration);
        System.out.println(duratio2);
        System.out.println(duratio3);
    }
}
