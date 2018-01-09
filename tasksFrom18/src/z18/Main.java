package z18;

public class Main {

    public static void main(String[] args) {


        Robot robot = new Robot();
        robot.printRobotParts();
        System.out.println(robot.isReady());

        robot.getRobotParts().put(Detail.newRnd(), false);

        robot.printRobotParts();
        System.out.println(robot.isReady());

    }
}
