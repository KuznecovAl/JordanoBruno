package z17_3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> mp=new HashMap<>();
        mp.put("123",15);
        mp.put("1234",12);
        mp.put("12345",9);
        mp.put("123456",6);
        mp.put("1234567",3);
        mp.put("12345678",0);


        int i = mp.entrySet().stream()
                .filter(s->s.getKey().length()<7)
                .mapToInt(s->s.getValue())
                .sum();

        System.out.println(i);





    }
}
