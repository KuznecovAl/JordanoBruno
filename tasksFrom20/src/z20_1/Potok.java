package z20_1;

public class Potok extends Thread {

    int sec;

    public Potok(int sec) {
        this.sec = sec;
    }

    @Override
    public void run() {
        System.out.println("start" + sec);
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nЯ спал " + sec + " секунд.");

    }
}
