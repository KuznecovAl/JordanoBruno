package z11_1;

import java.util.*;

public class Main {

    //метод возвращает количество уникальных элементов
    static int countUnique(List ls) {
        Map<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < ls.size(); i++) {
            unique.put((Integer) ls.get(i), unique.containsKey(ls.get(i)) ? unique.get(ls.get(i)) + 1 : 1);
        }
        return unique.size();
    }


    public static void main(String[] args) {
        Integer[] m = new Integer[]{2, 3, 4, 6, 1, 2, 3, 4, 8, 4, 2};
        List<Integer> list = new ArrayList<>(Arrays.asList(m));
        System.out.println("" + countUnique(list));
    }

}



