package z18;

import java.util.HashMap;
import java.util.Optional;


public class Robot {

    private HashMap<Detail, Boolean> robotParts;
    private int counter;

    /*Конструктор создает пустого робота*/
    public Robot() {
        robotParts = new HashMap<>(9);
        Details[] d = Details.values();
        for (Details aD : d) {
            robotParts.put(new Detail(aD.name()), false);
        }
        counter=0;
    }

    /*геттер мапки с деталями*/
    public HashMap<Detail, Boolean> getRobotParts() {
        return robotParts;
    }

    /*пока незнаю зачем сеттер мапки*/
    public void setRobotParts(HashMap<Detail, Boolean> robotParts) {
        this.robotParts = robotParts;
    }


    /*вывод на печать содержимого мапки*/
    public void printRobotParts() {
        robotParts.forEach((x, y) -> System.out.println("Key: " + x.getName() +" : " + y));
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    /*проверка готовности робота*/
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
