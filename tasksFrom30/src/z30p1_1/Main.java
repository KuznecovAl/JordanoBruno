package z30p1_1;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.print("Введите bel/rus/eng:");
        String lng= inp.nextLine();
        Locale loc;

        switch (lng){
            case "bel":
                loc=new Locale("be","BY");
                break;
            case "rus":
                loc=new Locale("ru","RU");
                break;
            case "eng":
                loc=new Locale("en","US");
                break;
            default:
                loc=Locale.getDefault();
                break;
        }

        ResourceBundle rb=ResourceBundle.getBundle("\\z30p1_1\\Message",loc);
        System.out.println(rb.getString("msg"));


    }
}
