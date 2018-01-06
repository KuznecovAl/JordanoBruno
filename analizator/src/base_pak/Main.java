package base_pak;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        int i=12;
        BigDecimal bd=new BigDecimal(1000.223);
        TestClass t=new TestClass(i,bd);
        ClassAnalyzer.analyze(t);

    }
}

