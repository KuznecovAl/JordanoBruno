package z11_3;

import java.util.Map;

public class Utils {


    static void print(Map m) {
        m.forEach((key, value) -> System.out.print("(" + value + "*x^" + key + ") + "));
        System.out.println();
    }


    static void adding(Map<Integer, Integer> m1, Map<Integer, Integer> m2) {
        //TreeMap<Integer, Integer> result = new TreeMap<>();

        for (Map.Entry<Integer,Integer> pair : m2.entrySet()) {
            if (m1.containsKey(pair.getKey())){
                m1.put(pair.getKey(), m1.get(pair.getKey())+pair.getValue());
            }else{
                m1.put(pair.getKey(), pair.getValue());
            }

        }


    }


}
