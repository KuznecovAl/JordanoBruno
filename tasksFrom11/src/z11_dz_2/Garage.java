package z11_dz_2;

import com.sun.istack.internal.Nullable;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private static HashMap<Car, Integer> cars = new HashMap<>();

    static void printGarage() {
        if (!cars.isEmpty()) {
            for (Map.Entry<Car, Integer> pair : cars.entrySet()) {
                System.out.println(pair);
            }
        } else {
            System.out.println("Гараж пуст!");
        }
    }

    static void carIn(Car car) {
        System.out.println("В гараж въехал автомобиль:");
        System.out.println("+++++ "+car.toString());
        cars.put(car, cars.containsKey(car) ? cars.get(car) + 1 : 1);
    }

    static void carOut(Car car) {
        if (cars.containsKey(car)) {
            System.out.println("Из гаража выехал автомобиль:");
            System.out.println("----- "+car.toString());
            cars.put(car, cars.get(car) == 1 ? 0 : cars.get(car) - 1);
            if (cars.get(car)==0){
                cars.remove(car,0);
            }
        } else {
            System.out.println("В гараже нет такого автомобиля!");
        }
     }

     static int getCraCount(Car car){

        if(cars.containsKey(car)){
            return cars.get(car);
        }else return 0;

     }

}



