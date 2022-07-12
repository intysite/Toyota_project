package main.homework1.details;

public class Wheel {
    private int size;
    private boolean wheelIsOk;

    public Wheel(WheelSizes wheelSize, boolean wheelIsOk) {
        this.size = wheelSize.getSize();
        this.wheelIsOk = wheelIsOk;
    }

    public int getSize() {
        return size;
    }

    public boolean getWheelIsOk() {
        return wheelIsOk;
    }

    public void setWheelIsOk(boolean wheelIsOk) {
        this.wheelIsOk = wheelIsOk;
    }
}
