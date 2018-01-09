package z18;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Robot {

    private HashMap<Detail, Boolean> robotParts;

    public Robot() {
        robotParts = new HashMap<>(9);
        Details[] d = Details.values();
        for (Details aD : d) {
            robotParts.put(new Detail(aD.name()), true);
        }

    }


    public HashMap<Detail, Boolean> getRobotParts() {
        return robotParts;
    }

    public void setRobotParts(HashMap<Detail, Boolean> robotParts) {
        this.robotParts = robotParts;
    }

    public void printRobotParts() {
        robotParts.forEach((x, y) -> System.out.println("Key: " + x.getName() + " h.name: " + x.hashCode() + ", value: " + y));
    }


    public boolean isReady() {

        Optional<Boolean> result = robotParts.values().stream()
                .filter(b -> !b)
                .findFirst();
        if (result.isPresent()) {
            return false;
        } else {
            return true;
        }


    }


}
