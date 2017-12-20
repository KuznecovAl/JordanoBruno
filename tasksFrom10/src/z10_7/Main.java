package z10_7;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] m = new Integer[]{-2, 6, -7, 8, 9, 0, 34, 12, -45, 67, -1, 78, 0, -3, 4, 6};

        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(m));

        Utils.printArrayList(al1);
        Utils.printArrayList(Utils.sortMethod1(al1));
        Utils.printArrayList(Utils.sortMethod2(al1));


    }
}
