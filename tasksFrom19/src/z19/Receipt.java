package z19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Receipt {

    private int casse_number;
    private LocalDateTime date_of_operation;
    private HashMap<Good,Integer> basket;
    private int customers_money;

    /*конструктор чека*/
    public Receipt(int casse_number, LocalDateTime date_of_operation, HashMap<Good,Integer> basket, int customers_money) {
        this.casse_number = casse_number;
        this.date_of_operation = date_of_operation;
        this.basket = basket;
        this.customers_money = customers_money;
    }

    /*геттер номера кассы*/
    public int getCasse_number() {
        return casse_number;
    }

    /*метод создания чека возвращает String*/
    public String checkPrinter(){
        StringBuilder string_of_receipt=new StringBuilder();
        string_of_receipt.append("###############################\n");
        string_of_receipt.append("#          КАССА №"+casse_number+"           #\n");
        string_of_receipt.append("###############################\n");

        final int[] counter_of_goods = {1};
        basket.forEach((Good x, Integer y) -> {
            string_of_receipt.append("" + counter_of_goods[0]++ + "."+x.getName()+"x"+y+"штx"+x.getPrice()+"р\n")
              .append("сумма по позиции:"+x.getPrice()*y+"-"+x.getDiscount()+"% = "
                      +((x.getPrice()*y)-(x.getPrice()*y*x.getDiscount()/100))+"\n");
        });

        final int[] sum_of_receipt = {0};
        basket.forEach((x, y) -> sum_of_receipt[0] +=x.getPrice()*y);
        string_of_receipt.append("Итоговая сумма: "+sum_of_receipt[0]+"\n");
        if(customers_money==0){
            string_of_receipt.append("Спасибо что без сдачи!\n");
        }else{
            string_of_receipt.append("Внесено: "+customers_money+"р\n");
            string_of_receipt.append("Сдача: "+(customers_money-sum_of_receipt[0])+"р\n");
        }

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        string_of_receipt.append(formatter.format(date_of_operation)+"\n");
        string_of_receipt.append("###############################\n");


        return string_of_receipt.toString();
    }


}
