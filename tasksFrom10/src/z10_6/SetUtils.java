package z10_6;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {

    /*Вывод на печать множества*/
    static void printSet(Set one) {
        for (int i = 0; i < one.toArray().length; i++) {
            System.out.print((one.toArray()[i]) + " ");
        }
        System.out.println();
    }

    /*Вывод на печать одинаковых элементов*/
    static void printTheSame(Set one, Set two) {
        HashSet<Integer> temp = new HashSet<>(one);
        temp.retainAll(two);
        System.out.print("Одинаковые элементы: ");
        printSet(temp);
    }

    /*Объединение множеств*/
    static Set compareSets(Set one, Set two) {
        HashSet<Integer> temp = new HashSet<>(one);
        temp.addAll(two);
        return temp;
    }


}
