package z30p2_7_8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;


public class Main implements TemporalAdjuster {
    public static void main(String[] args) {

        //for task 7
        /*LocalDate d1 = LocalDate.now();
        System.out.println(d1);


        d1=d1.with(new Main());
        System.out.println(d1);
*/

        LocalDate d1 = LocalDate.of(2005, 7, 2);
        //LocalDate d1 = LocalDate.of(2005, 11, 5);
        System.out.println(d1);
        d1 = d1.with(new Main());
        System.out.println(d1);


    }


    @Override
    public Temporal adjustInto(Temporal temporal) {

        LocalDate temp1 = LocalDate.from(temporal);
        int i = temp1.getYear();

        if ((temp1.lengthOfYear() - temp1.getDayOfYear()) < (temp1.lengthOfYear() / 2)) {
            i++;
        } else if ((temp1.lengthOfYear() - temp1.getDayOfYear()) == (temp1.lengthOfYear() / 2)) {
            System.out.println("середина года");
            i++;
        }

        temp1 = LocalDate.of(i, 1, 1);

        return temp1;

        //for task 7!!!
        //return temporal.plus(42, ChronoUnit.DAYS);

    }
}
