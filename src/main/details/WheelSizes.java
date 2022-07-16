package main.details;

public enum WheelSizes {
    SIXTEEN(16),
    SEVENTEEN(17),
    TWENTY(20);

    private int size;

    WheelSizes(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
