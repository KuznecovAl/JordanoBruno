package z11_2;

import java.util.*;

public class Main {

    static boolean isUniquee(Map m) {
        Set<String> s = new HashSet<>();
        s.addAll(m.values());
        if (s.size() != m.size()) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {

        Map<String,String> m=new HashMap<>();
        m.put("1","1");
        m.put("2","2");
        m.put("3","3");
        m.put("4","0");
        m.put("5","5");

        System.out.println(""+isUniquee(m));

    }


}
