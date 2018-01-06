package z11_dz_2;

public class Main {

    public static void main(String[] args) {

        Car car1=new Bus("Мерседес","Спринтер",2007,"Красный",16);
        Car car2=new Sedan("Мерседес","ML500",2015,"Черный",5);
        Car car3=new Sedan("Дэу","Матиз",1998,"Белый",3);
        Car car4=new Truck("Мерседес","XXX",2012,"Красный",36);
        Car car5=new Truck("Мерседес","XXX",2012,"Красный",36);

        Garage.carIn(car1);
        Garage.carIn(car2);
        Garage.carIn(car3);
        Garage.carIn(car4);
        Garage.carIn(car5);


        Garage.printGarage();
        Garage.carOut(car2);
        Garage.printGarage();
        System.out.println(Garage.getCraCount(car4));

    }


}
