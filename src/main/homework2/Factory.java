package main.homework2;

import main.homework1.details.*;

public class Factory {
    private Countries country;

    public Factory(Countries country) {
        this.country = country;
    }

    public Countries getCountry() {
        return country;
    }

    public Wheel[] createWheelsArray(WheelSizes wheelSizes) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(wheelSizes, true);
        }
        return wheels;
    }

    public GasTank createGasTank() {
        return new GasTank(0);
    }

    public Engine createEngine() {
        return new Engine(true);
    }

    public Electric createElectric() {
        return new Electric(true);
    }

    public HeadLights createHeadLights() {
        return new HeadLights(true);
    }

    public MusicUsb createMusicUsb() {
        return new MusicUsb(true);
    }

    public MiniFridge createMiniFridge() {
        return new MiniFridge(true);
    }

    public Wheel createSpareWheel(WheelSizes wheelSizes) {
        return new Wheel(wheelSizes, true);
    }

    public Socket createSocket() {
        return new Socket(true);
    }
}
