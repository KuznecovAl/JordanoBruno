package z16_2_3;

public class Notebook extends Computer {

    private int displayDiagonal;
    private transient String model;
    private Touchpad touchpad;

    public Notebook(int cpuMz, int memGb, int hddGb, String serial, int displayDiagonal, String model, Touchpad touchpad) {
        super(cpuMz, memGb, hddGb, serial);
        this.displayDiagonal = displayDiagonal;
        this.model = model;
        this.touchpad = touchpad;
    }

    public int getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(int displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString()+"Ноутбук "+model+" с диагональю "+displayDiagonal+"\""+" и тачпадом с "+touchpad.getButtons()+" кнопками";
    }
}

