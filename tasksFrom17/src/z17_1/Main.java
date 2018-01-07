package z17_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] m=new int[] {1,2,3,5,10,15,12,89,13,9};

        Arrays.stream(m)
                .filter(i->i%2!=0)
                .filter(i->i%5==0)
                .average()
                .ifPresent(System.out::println);
    }
}
