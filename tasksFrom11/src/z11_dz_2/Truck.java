package z11_dz_2;

public class Truck extends Car {

    private int carrCapacity;

    public Truck(String mark, String model, int year, String color, int carrCapacity) {
        super(mark, model, year, color);
        this.carrCapacity = carrCapacity;
    }

    public int getCarrCapacity() {
        return carrCapacity;
    }

    public void setCarrCapacity(int carrCapacity) {
        this.carrCapacity = carrCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        return carrCapacity == truck.carrCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carrCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Грузовик " + super.getMark() + " "+ super.getModel() + " " + super.getYear() +" г.в., цвет " +
                super.getColor() + " грузоподъемностью " + carrCapacity + "т.";
    }
}
