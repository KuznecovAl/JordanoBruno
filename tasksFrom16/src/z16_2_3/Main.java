package z16_2_3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Computer c = new Computer(1700, 4, 500, "324566770");
        Notebook n=new Notebook(2400,8,1024,"935639875",15,"Asus",new Touchpad(2));

        System.out.println(c.toString());
        System.out.println(n.toString());

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res\\comp.dat"))) {
            oos.writeObject(c);
            oos.writeObject(n);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res\\comp.dat"))) {

            Computer c1 = (Computer) ois.readObject();
            System.out.println(c1.toString());

            Notebook n1 = (Notebook) ois.readObject();
            System.out.println(n1.toString());

        }catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }


    }
}
