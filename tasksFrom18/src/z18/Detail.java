package z18;

import java.util.Objects;

public class Detail {

    private String name;

    /*конструктор*/
    public Detail(String name) {
        this.name = name;
    }

    /*геттер названия детали*/
    public String getName() {
        return name;
    }

    /*создание произвольной детали*/
    public static Detail newRnd() {
        Details[] d = Details.values();
        return new Detail(d[(int) (Math.random() * d.length)].name());
    }

    /*переопределяем equals*/

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        final Detail other=(Detail) obj;
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
        return name+" h: "+name.hashCode();
    }
}
