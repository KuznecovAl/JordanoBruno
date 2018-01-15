package z19;


import java.io.File;
import java.util.ArrayList;

public class Main {

    public static  ArrayList<CashBox> cashboxes=new ArrayList<>();

    public static void main(String[] args) {

        /*удаляем старые логи*/
        for (File f : new File("log").listFiles()) f.delete();

        /*Создание касс*/
        for (int i = 0; i < (int)(1+Math.random()*3); i++) {
            System.out.println("В магазине работает касса №"+i);
            cashboxes.add(new CashBox(i));
        }

        /*Создание покупателей*/
        for (int i = 0; i < 10; i++) {
            Customer.newRnd();
        }


    }
}