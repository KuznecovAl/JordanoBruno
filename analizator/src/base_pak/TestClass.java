package base_pak;

import java.math.BigDecimal;

@myAnnotation
public class TestClass {
    int i;
    BigDecimal bd;
    static private final int CONST = 12;

    public TestClass(int i, BigDecimal bd) {
        this.i = i;
        this.bd = bd;
    }

    public TestClass(int i) {
        this.i = i;
        this.bd = new BigDecimal(0);
    }

    public TestClass(BigDecimal bd) {
        this.i = 0;
        this.bd = bd;
    }

    public static void printingStatic() {
        System.out.println("" + CONST);
    }

    public void printing(int a) {
        System.out.println("" + a);
        System.out.println("" + i + " " + bd);
    }


}
