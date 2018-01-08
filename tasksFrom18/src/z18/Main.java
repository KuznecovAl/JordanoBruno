package z18;

public class Main {

    public static void main(String[] args) {


        Robot robot = new Robot();
        System.out.println(robot.isReady());
        Detail dt = Detail.newRnd();

        robot.getRobotParts().put(dt, false);

        robot.getRobotParts().keySet().stream()
                .filter(x->dt.equals(x))
                .forEach(System.out::println);


        System.out.println("----");

        robot.getRobotParts().forEach((x, y) -> System.out.println("Key: " + x.hashCode() + ", value: " + y));
        System.out.println(robot.isReady());

        Detail d;
        for (int i = 1; i < 5; i++) {
            d = Detail.newRnd();
            System.out.println("-" + d.getName());
        }


    }
}
