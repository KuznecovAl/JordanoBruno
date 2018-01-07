package z17_2;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> al=new ArrayList<>();
        al.add("12345678");
        al.add("123456789");
        al.add("123456789");
        al.add("1234567");
        al.add("123456");
        al.add("1234567890");
        al.add("1234567890");

        long count = al.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();

        System.out.println(count);
    }
}
