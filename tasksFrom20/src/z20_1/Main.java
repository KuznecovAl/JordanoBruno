package z20_1;

import sun.nio.ch.ThreadPool;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        final Executor executor = Executors.newFixedThreadPool(1);
        boolean bool = true;
        Scanner inp = new Scanner(System.in);
        int input_value;
        do {

            System.out.print("Вводи что-то:");


            input_value = inp.nextInt();

            if (input_value >= 0) {
                executor.execute(new Potok(input_value));
            } else {

                bool = false;
            }

        } while (bool);
    }
}
