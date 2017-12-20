package z10_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class Utils {

    /*Метод печати Листа*/
    static void printArrayList(ArrayList al1) {
        ListIterator<Integer> lI = al1.listIterator();
        while (lI.hasNext()) {
            System.out.print(lI.next() + " ");
        }
        System.out.println();
    }
    /*Метод сортировки по условию задачи*/
    static ArrayList<Integer> sortMethod1(ArrayList<Integer> al1){

        ArrayList<Integer> al2=new ArrayList<>();

        ListIterator<Integer> lI = al1.listIterator();
        while (lI.hasNext()) {
            lI.next();
            if (al1.get(lI.previousIndex()) > 0) {
                al2.add(al1.get(lI.previousIndex()));

            }
        }
        ListIterator<Integer> lI2 = al1.listIterator();
        while (lI2.hasNext()) {
            lI2.next();
            if (al1.get(lI2.previousIndex()) == 0) {
                al2.add(al1.get(lI2.previousIndex()));

            }
        }
        ListIterator<Integer> lI3 = al1.listIterator();
        while (lI3.hasNext()) {
            lI3.next();
            if (al1.get(lI3.previousIndex()) < 0) {
                al2.add(al1.get(lI3.previousIndex()));

            }
        }
        return al2;
    }
    /*Метод сортировки с помощью метода сорт и реверса*/
    static ArrayList<Integer> sortMethod2(ArrayList<Integer> al1) {

        al1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.reverse(al1);
        return al1;
    }
}
