package base_pak;


public class Test {
    int x;

    public Test(int x) {
        this.x = x;
    }


    @Transaction
    public void methodAnnotated() {
        System.out.println("Аннотированный метод x=" + x);
    }


    public void methodNotAnnotated() {
        System.out.println("Неаннотированный метод x=" + x);
    }
}
