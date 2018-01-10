package z18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Scientist extends Thread {

    //ПОЛЯ
    //private ArrayList<Robot> robots = new ArrayList<>();
    private HashMap<Detail, Integer> mp = new HashMap<>();//мапка для хранения всех принесенных деталей
    private ArrayList<Detail> minion = new ArrayList<>(); //МИНЬОН с кармашком для деталек
    private int nights;     //колич. ночей
    private JunkYard j; //объект свалки
    private String name;  //имя ученого
    private File f;     //файл для записи лога

    //конструктор ученого принимает имя, колич. ночей, объект свалки для поиска деталей, и файл для записи промежуточных данных
    public Scientist(String name, int nights, JunkYard j, File f) {
        this.name = name;
        this.nights = nights;
        this.j = j;
        this.f = f;
    }

    @Override
    public void run() {

        //поток для записи файла
        String sss;
        BufferedWriter br2 = null;
        try {
            br2 = new BufferedWriter(new FileWriter(f));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //----------------------------


        for (int i = 1; i <= nights; i++) {

            sss = "до " + j.printJunk() + "\n";

            int rnd = (int) (1 + Math.random() * 4); // сколько деталек возьмет миньен(1-4)
            j.putORsetInJYSomeRandomDetail(false, rnd, minion); //миньон пошел за детальками


            //пишем лог
            try {
                br2.write(sss + "\n");
                br2.write("Миньон от " + name + " пытается собрать " + rnd + " деталей в " + i + "-ю ночь. Собрал " + minion.size() + "\n");
                br2.write("после " + j.printJunk() + "\n");
                br2.write("" + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            //---------------------

            //сброс деталек в хранилище и очистка кармашка миньона
            for (int j = 0; j < minion.size(); j++) {
                mp.put(minion.get(j), mp.containsKey(minion.get(j)) ? mp.get(minion.get(j)) + 1 : 1);
            }
            minion.clear();


        }

        //закрываем поток для записи лога
        try {
            br2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //геттер хранилища
    public HashMap<Detail, Integer> getMp() {
        return mp;
    }

    //геттер имени ученого
    public String getNam() {
        return name;
    }
}
