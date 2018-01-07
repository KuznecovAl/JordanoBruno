package z16_1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {



    static void methodBuffered(String s) throws IOException {
        long tB = System.currentTimeMillis();

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("res\\text1.txt"));
        for (int i=0;i<5242880;i++) {
            bos.write(s.charAt(0));
        }bos.close();
        long tE = System.currentTimeMillis();
        System.out.println("Время выполнения метода BuffredStrem: " + (tE - tB) + " мс");
    }



    static void methodNotBuffered(String s) throws IOException{
        long tB = System.currentTimeMillis();

        FileOutputStream fos=new FileOutputStream("res\\text2.txt");
        for (int i=0;i<5242880;i++) {
            fos.write(s.charAt(0));
        }fos.close();

        long tE = System.currentTimeMillis();
        System.out.println("Время выполнения метода notbuffered: " + (tE - tB) + " мс");
    }



    public static void main(String[] args) throws IOException{

        methodBuffered("0");
        methodNotBuffered("0");


    }
}
