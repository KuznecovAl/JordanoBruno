package z16_2_3;

import java.io.Serializable;

public class Touchpad implements Serializable {

    private int buttons;

    public Touchpad(int buttons) {
        this.buttons = buttons;
    }

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }
}
