package z18;

import java.util.*;
import java.util.stream.Collectors;

public class JunkYard {

    private HashMap<Detail, Integer> junkYard;

    /*конструктор свалки сразу кидает 20 деталей*/
    public JunkYard() {
        this.junkYard = new HashMap<>();
        Details[] d = Details.values();
        for (Details aD : d) {
            junkYard.put(new Detail(aD.name()), 0);
        }
        putORsetInJYSomeRandomDetail(true, 20, null);
    }

    /*Печать содержимого свалки*/
    public String printJunk() {
        StringBuilder sb=new StringBuilder();
        junkYard.forEach((x, y) -> sb.append("").append(x.getName()).append(":").append(y).append(" "));
        return sb.toString();
    }

    /*метод для добавления и забирания деталей со свалки
    если флаг фэлс то берем если тру то ложим*/
    public synchronized void putORsetInJYSomeRandomDetail(boolean flag, int count, ArrayList<Detail> ar) {


        if (flag) { //добавление деталей на свалку
            for (int i = 0; i < count; i++) {
                Detail d = Detail.newRnd();
                junkYard.put(d, junkYard.containsKey(d) ? junkYard.get(d) + 1 : 1);
            }
        } else { //забираем детали со свалки

            /*Перегоняем сеты мапки в лист чтоб потом произвольные детальки брать*/
            List<Map.Entry<Detail, Integer>> temp =
                    junkYard.entrySet().stream()
                            .filter(x -> x.getValue() > 0)
                            .collect(Collectors.toList());

            /*здесь берем нужное нам количество произвольных деталей и убираем их со свалки*/
            int i = 0;
            while (temp.size() != 0 & i < count) {
                int j = (int) (0 + Math.random() * (temp.size() - 1));
                ar.add(temp.get(j).getKey()); //добавили в миньена
                junkYard.put(temp.get(j).getKey(), ((junkYard.get(temp.get(j).getKey())) - 1));//удалили со свалки и из temp
                if(temp.get(j).getValue()==0) temp.remove(j); //удалили из временного листа если количество 0
                i++;
            }


        }
        //тот кто пришел дрыхнет тут треть ночи
        try {
            Thread.sleep(33);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}





