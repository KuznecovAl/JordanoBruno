package z18;

public class Fabric extends Thread {

    private int nights;
    private JunkYard j;

    //конструктор принимает количество ночей и объект свалки для сброса деталей
    public Fabric(int nights, JunkYard j) {
        this.nights = nights;
        this.j = j;
    }

    @Override
    public void run() {

        for (int i = 1; i <= nights; i++) {

            //System.out.println("до " + j.printJunk());
            int rnd = (int) (1 + Math.random() * 4);        //количество деталей для сброса(1-4)
            j.putORsetInJYSomeRandomDetail(true, rnd, null);        //собственно сбрасываем детали
            System.out.println("Фабрика выбрасывает " + rnd + " деталей в " + i + "-ю ночь.");
            //System.out.println("после " + j.printJunk()+"\n");



        }


    }
}
