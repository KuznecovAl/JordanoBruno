package z10_6;


import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Integer[] m1=new Integer[] {1,2,3,4,5,6};
        Integer[] m2=new Integer[] {2,6,7,8,9,1,78};

        HashSet<Integer> set1=new HashSet<>(Arrays.asList(m1));
        HashSet<Integer> set2=new HashSet<>(Arrays.asList(m2));
        HashSet<Integer> set3=new HashSet<>();

        System.out.print("Первое множество: ");
        SetUtils.printSet(set1);
        System.out.print("Второе множество: ");
        SetUtils.printSet(set2);


        SetUtils.printTheSame(set1,set2);
        set3.addAll(SetUtils.compareSets(set1,set2));
        System.out.print("Объединенное множество: ");
        SetUtils.printSet(set3);
    }
}
