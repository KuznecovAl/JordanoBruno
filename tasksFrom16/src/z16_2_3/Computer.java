package z16_2_3;

import java.io.Serializable;

public class Computer implements Serializable {

        private int cpuMz;
        private int memGb;
        private int hddGb;
        private String serial;

    public Computer(int cpuMz, int memGb, int hddGb, String serial) {
        this.cpuMz = cpuMz;
        this.memGb = memGb;
        this.hddGb = hddGb;
        this.serial = serial;
    }

    public int getCpuMz() {
        return cpuMz;
    }

    public void setCpuMz(int cpuMz) {
        this.cpuMz = cpuMz;
    }

    public int getMemGb() {
        return memGb;
    }

    public void setMemGb(int memGb) {
        this.memGb = memGb;
    }

    public int getHddGb() {
        return hddGb;
    }

    public void setHddGb(int hddGb) {
        this.hddGb = hddGb;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Computer" + ", serial=" + serial + ", процессор " + cpuMz +" Mz, ОЗУ: " + memGb + ", ПЗУ:" + hddGb;
    }
}
