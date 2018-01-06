package base_pak;
import java.lang.reflect.Method;
public class Main {

    public static void main(String[] args) throws Exception{
        Test t = new Test(10);

        Class cl1 = t.getClass();

        Method[] method = cl1.getDeclaredMethods();

        for (Method md : method) {
            if (md.isAnnotationPresent(Transaction.class)) {
                System.out.println("Transaction is started.");
                md.invoke(t);
                System.out.println("Transaction is ended.");
            } else {
                md.invoke(t);
            }
        }
    }
}