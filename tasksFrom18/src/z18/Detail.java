package z18;

public class Detail {

    private String name;

    public Detail(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Detail newRnd() {
        Details[] d = Details.values();
        return new Detail(d[(int) (Math.random() * d.length)].name());
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.hashCode()==obj.hashCode();
//    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name+" h: "+name.hashCode();
    }
}
