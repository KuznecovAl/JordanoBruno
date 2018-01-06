package z11_4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(-3);
        l.add(5);
        l.add(9);
        l.add(1);
        l.add(13);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(13);

        BlackBox bb = new BlackBox((ArrayList<Integer>) l);

        bb.print();
        bb.addInt(3);
        bb.print();
        System.out.println(bb.returnMAX(2));
        bb.print();
        System.out.println(bb.returnMIN(3));
        bb.print();





    }
}