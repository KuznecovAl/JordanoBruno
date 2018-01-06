package base_pak;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ClassAnalyzer {

    public static void analyze(Object obj) {
        Class cl = obj.getClass();
        analyze(cl);
    }

    public static void analyze(Class clazz) {
        System.out.println("объект типа " + clazz.getSimpleName());

        Annotation[] ann=clazz.getAnnotations();
        System.out.println("Аннотации("+ann.length+")"+": ");
        for (Annotation an:ann){
            System.out.println("---- "+an);
        }

        Field [] fld=clazz.getDeclaredFields();
        System.out.println("Поля("+fld.length+")"+": ");
        for (Field fl:fld){
            System.out.println("---- "+fl);
        }


        Constructor[] constr =clazz.getDeclaredConstructors();
        System.out.println("Конструкторы("+constr.length+")"+": ");
        for (Constructor cn:constr){
            System.out.println("---- "+cn);
        }

        Method[] methods=clazz.getDeclaredMethods();
        System.out.println("Методы("+methods.length+")"+": ");
        for (Method mt:methods){
            System.out.println("---- "+mt);
        }



    }




}
