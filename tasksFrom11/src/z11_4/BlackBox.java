package z11_4;

import java.util.*;

public class BlackBox {
    private List<Integer> list;

    BlackBox(ArrayList<Integer> list) {
        this.list = list;
    }
    //добавление числа
    public void addInt(Integer i) {
        list.add(i);

    }

    //печать черного ящика
    public void print() {
        ListIterator<Integer> lI = list.listIterator();
        do {
            System.out.print(" " + lI.next());
        } while (lI.hasNext());
        System.out.println();
    }
    //Нахождение k-Min числа
    public Integer returnMIN(int k) {
        if(k>list.size()){return null;}

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return list.get(k-1);
    }

    //Нахождение n-Max числа
    public Integer returnMAX(int n) {
        if(n>list.size()){return null;}
        List<Integer> temp=new ArrayList<>();
                temp.addAll(list);
        temp.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        return temp.get(temp.size()-n);
    }


}

