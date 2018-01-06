package z11_dz_2;

public class Bus extends Car{

    private int passengers;

    public Bus(String mark, String model, int year, String color, int passengers) {
        super(mark, model, year, color);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;

        Bus bus = (Bus) o;

        return passengers == bus.passengers;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passengers;
        return result;
    }

    @Override
    public String toString() {
        return "Автобус " + super.getMark() + " "+ super.getModel() + " " + super.getYear() +" г.в., цвет " +
                super.getColor() + " рассчитанный на " + passengers + " пасажиров.";

    }
}
