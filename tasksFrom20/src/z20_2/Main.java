package z20_2;

import java.util.ArrayList;

public class Main {

    static volatile int maxval = 0;
    static volatile long time = 0;

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> al2 = new ArrayList<>();
        for (long i = 0; i < 10000000; i++) {
            al.add((int) (1 + Math.random() * 300000000));
        }


        long tB = System.currentTimeMillis();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) > maxval) Main.maxval = al.get(i);
        }
        long tE = System.currentTimeMillis();
        System.out.println("Время выполнения 1 потоком: " + (tE - tB) + " мс maxval=" + Main.maxval);

        Main.maxval = 0;
        for (int i = 0; i < 10000000; i += 1000000) {
            for (int j = i; j < i + 1000000; j++) {
                temp.add(al.get(j));
            }
            al2.add((ArrayList<Integer>) temp.clone());
            temp.clear();
        }

        for (int i = 0; i < 10; i++) {
            //System.out.println("ст пот"+i);
            Potok.make(al2.get(i));
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Время выполнения 10 потоками: " + Main.time + " мс maxval=" + Main.maxval);

    }

}

