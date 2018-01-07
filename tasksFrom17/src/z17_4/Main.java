package z17_4;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String s= Stream.of(5,4,3,4,5)
                .map(i->i.toString())
                .collect(Collectors.joining());

        System.out.println(s);


    }
}
