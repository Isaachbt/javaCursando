package datas.teste;

import java.time.*;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        //esse aqui e sobre zone, fuso horario de cada lugar

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);//mostrando todas as zonas que o java pega
        System.out.println(ZoneId.systemDefault());// mostrando a minha zona atual

        //passando uma zona especifica
        ZoneId tokyoZon = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZon);

        //mostrando o fuso harario especifico de outro pais
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyoZon);
        System.out.println(zonedDateTime);


        //mostrando a data e horario de outro pais, com os dados ja aplicado
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZon);
        System.out.println(zonedDateTime1);

        //pegando uma zona q vc ainda não sabe
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset ofSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(ofSetManaus);
        System.out.println(offsetDateTime);
    }
}
