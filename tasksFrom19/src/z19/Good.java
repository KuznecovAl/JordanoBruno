package z19;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Good {

    private int id;
    private String name;
    private int price;
    private int discount;

    /*конструктор*/
    public Good(String name, int price, int discount) {
        this.id = name.hashCode();
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    /*Геттеры*/
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getDiscount() {
        return discount;
    }
    public int getId() {
        return id;
    }

    /*переопределяем equals*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Good other = (Good) obj;
        return Objects.equals(this.name, other.name);
    }

    /*переопределяем hashcode*/
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    /*переопределяем toString*/
    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + discount + " ";
    }

    /*метод создания объекта произвольного товара(данные по товыру берем из Goods.txt*/
    public static Good newRnd() {

        int randomNumber;
        String line;
        ArrayList<String> array_list_of_goods = new ArrayList<>();
        try {
            BufferedReader goodsBufferedReader = new BufferedReader(new FileReader("resourses//Goods.txt"));  ///?????
            try {
                while ((line = goodsBufferedReader.readLine()) != null) array_list_of_goods.add(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        randomNumber = (int) (Math.random() * array_list_of_goods.size());
        line = array_list_of_goods.get(randomNumber);
        return new Good(line.substring(0, 20), Integer.parseInt(line.substring(20, 24)), Integer.parseInt(line.substring(24, 26)));
    }
}