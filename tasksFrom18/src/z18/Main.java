package z18;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.printRobotParts();
        System.out.println(robot.isReady());
        System.out.println(robot.getCounter());

        Detail d;
        int prohod=0;
        do {
            prohod++;
            d = Detail.newRnd();

            if (!robot.getRobotParts().get(d) & robot.getCounter() != 9) {
                robot.getRobotParts().put(d, true);
                robot.setCounter(robot.getCounter() + 1);

                robot.printRobotParts();
                System.out.println(robot.isReady());
                System.out.println(robot.getCounter());
                System.out.println(prohod);
            }
        }while (robot.getCounter()<9);




    }
}
