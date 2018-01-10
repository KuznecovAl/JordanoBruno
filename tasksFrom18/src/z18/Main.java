package z18;

import java.io.File;
import java.util.Map;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int nights = 100;

        JunkYard j = new JunkYard();
        Fabric f = new Fabric(nights, j);

        Scientist s1 = new Scientist("Сумасшедший Психопат", nights, j, new File("res//sc1.txt"));
        Scientist s2 = new Scientist("Параноидальный Шизофреник", nights, j, new File("res//sc2.txt"));


        System.out.println("Начальное состояние");
        System.out.println(j.printJunk());
        System.out.println();

        f.start();
        s1.start();
        s2.start();


        try {
            f.join();
            s1.join();
            s2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("main");
        System.out.println(j.printJunk());

        s1.getMp().forEach((x, y) -> System.out.println("Key: " + x.getName() +" : " + y));
        System.out.println("-------");
        s2.getMp().forEach((x, y) -> System.out.println("Key: " + x.getName() +" : " + y));

        Optional<Map.Entry<Detail, Integer>> m1 = s1.getMp().entrySet().stream()
                .sorted((Map.Entry.comparingByValue()))
                .findFirst();

        Optional<Map.Entry<Detail, Integer>> m2 = s2.getMp().entrySet().stream()
                .sorted((Map.Entry.comparingByValue()))
                .findFirst();

        System.out.println(s1.getNam()+" собрал "+m1.get().getValue()+" роботов.");
        System.out.println(s2.getNam()+" собрал "+m2.get().getValue()+" роботов.");
        System.out.println("Победитель очевиден!!!");




        //        Detail d;
//        int prohod=0;
//        do {
//            prohod++;
//            d = Detail.newRnd();

//            if (!robot.getRobotParts().get(d) & robot.getCounter() != 9) {
//                robot.getRobotParts().put(d, true);
//                robot.setCounter(robot.getCounter() + 1);
//
//                robot.printRobotParts();
//                System.out.println(robot.isReady());
//                System.out.println(robot.getCounter());
//                System.out.println(prohod);
//            }
//        }while (robot.getCounter()<9);
//


    }
}
