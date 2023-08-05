package formatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {
        //essa e a forma de formatar as datas em java

        LocalDate date = LocalDate.now();

        String format1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_DATE);
        String format3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);

        //formantando as datas para oq foi passado
        LocalDate parse1 = LocalDate.parse("20221112",DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        LocalDateTime now = LocalDateTime.now();
        String f1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(f1);


        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

    }
}
