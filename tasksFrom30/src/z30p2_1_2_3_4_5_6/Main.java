package z30p2_1_2_3_4_5_6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //<<<   1   >>>
        LocalDate d1 = LocalDate.of(2020,6,25);
        System.out.println(d1);

        //<<<   2   >>>
        d1=LocalDate.now();
        LocalDate d2=d1.plusMonths(3);
        System.out.println(d2);

        //<<<   3   >>>
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.LL.Y");
        System.out.println(formatter.format(d1));

        //<<<   4   >>>
        d1=LocalDate.parse("26-03-2014",DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        System.out.println(d1);

        //<<<   5   >>>
        d1=LocalDate.now();
        d2=LocalDate.of(2020,6,25);
        System.out.println("дней между:" + d1.until(d2, ChronoUnit.DAYS));

        //<<<   6   >>>
        d1=LocalDate.now();
        d2=LocalDate.of(2020,6,25);
        Long sec=(d1.until(d2, ChronoUnit.DAYS))*24*60*60;
        System.out.println("Секунд между:" + sec);






    }
}
