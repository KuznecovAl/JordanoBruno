package z19;

import org.apache.log4j.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;

public class CashBox {

    private int cass_identifier;
    private Logger logger;

    /*конструктор кассы*/
    public CashBox(int cass_identifier) {
        this.cass_identifier = cass_identifier;
        /*создаем логгер для каждой кассы пишем в оттдельный файл и на консоль(закоментировано)*/
        this.logger = Logger.getLogger(""+cass_identifier);
        try {
            logger.addAppender(new FileAppender(new PatternLayout("%m%n"), "log//"+this.cass_identifier+".txt"));
            //logger.addAppender(new ConsoleAppender(new PatternLayout("%m%n"),"System.out"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*синхронизированный метод для обслуживания покупателей возвращает объект чека*/
    public synchronized Receipt customerService(String customers_name, HashMap<Good,Integer> basket) {
        logger.info(customers_name+" начинает обслуживаться");

        StringBuilder string_for_cass_logger=new StringBuilder();

        final int[] sum_of_receipt = {0};
        basket.forEach((x, y) -> sum_of_receipt[0] +=x.getPrice()*y);
        basket.forEach((x, y) -> {
            string_for_cass_logger.append("Касса № " + cass_identifier + " пробивает для " + customers_name + " :\n")
                    .append(x.getName())
                    .append(" в количестве ").append(y).append(" штуки,\n")
                    .append("по цене: " + x.getPrice() + " и применяет скидку: " + x.getDiscount() + "%\n")
                    .append("итог по позиции: " + x.getPrice() * y + "-" + x.getDiscount() + "% = " + ((x.getPrice() * y) - (x.getPrice() * y * x.getDiscount() / 100)) + "\n")
                    .append("итоговая сумма: " + sum_of_receipt[0] + "\n");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) { //задержка на пробивание каждого товара
                e.printStackTrace();
            }
        });

        int customers_money=0;
        if(Math.random()>=0.5){
            string_for_cass_logger.append("Покупатель внес сумму без сдачи. Спасибо.\n");
        }else{
            string_for_cass_logger.append("Покупатель внес 1000 рублей. Сдача "+(1000-sum_of_receipt[0])+"\n");
            customers_money=1000;
        }
        string_for_cass_logger.append("Обслуживание "+customers_name+" завершено.\n\n");
        logger.info(string_for_cass_logger.toString());

        Receipt rec = new Receipt(cass_identifier, LocalDateTime.now(),basket,customers_money);
        return rec;
    }


}
