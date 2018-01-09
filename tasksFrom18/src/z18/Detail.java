package z18;

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
        return super.hashCode()==obj.hashCode();
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
