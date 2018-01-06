package z11_dz_2;

public class Sedan extends Car {

    private int doors;

    public Sedan(String mark, String model, int year, String color, int doors) {
        super(mark, model, year, color);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sedan)) return false;
        if (!super.equals(o)) return false;

        Sedan sedan = (Sedan) o;

        return doors == sedan.doors;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + doors;
        return result;
    }

    @Override
    public String toString() {

        return "Седан " + super.getMark() + " "+ super.getModel() + " " + super.getYear() +" г.в., цвет " +
                super.getColor() + " дверей: " + doors;

        }
}
