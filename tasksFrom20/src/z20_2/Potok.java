package z20_2;

import java.util.ArrayList;

public class Potok extends Thread {

    ArrayList<Integer> al;

    public Potok(ArrayList<Integer> al) {
        this.al = al;
        start();

    }

    public static Potok make(ArrayList<Integer> al) {
        return new Potok(al);
    }


    @Override
    public void run() {
        long tB = System.currentTimeMillis();
        //System.out.println("я считаю");
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) > Main.maxval) Main.maxval = al.get(i);
        }
        long tE = System.currentTimeMillis();

        Main.time += (tE - tB);
        //System.out.println("я все");


    }
}
