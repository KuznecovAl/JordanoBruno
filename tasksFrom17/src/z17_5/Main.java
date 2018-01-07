package z17_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Person> ls = Arrays.asList(
                new Person("Alexandr", "Kuznecov", 673400),
                new Person("Sam", "Jackson", 6400),
                new Person("Ben", "Aflek", 7400),
                new Person("King", "Arthur", 145600)
        );

        Optional<Person> xxx = ls.stream()
                .filter(p -> p.getFirstName().length() + p.getLastName().length() < 15)
                .sorted((p1, p2) -> -p1.getAge().compareTo(p2.getAge()))
                .findFirst();

        System.out.println(xxx.get().toString());


    }
}
