package main.homework1;

import main.homework1.details.*;

public class Runner {
    public static void main(String[] args) {

        //Собираем Camry
        Camry camry = new Camry("black",
                240,
                TransmissionTypes.AUTOMATIC,
                false,
                35000,
                makeWheelsArray(WheelSizes.SEVENTEEN),
                makeGasTank(50),
                makeEngine(true),
                makeElectric(true),
                makeHeadLights(true),
                false,
                makeMusicUsb(true));

        try {
            camry.startCar();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        camry.headLightsOn();
        camry.cruiseOn();
        camry.musicUsbOn();
        camry.stopCar();
        System.out.println();

        //Собираем Solara
        Solara solara = new Solara("white",
                250,
                TransmissionTypes.ROBOTIC,
                false,
                40000,
                makeWheelsArray(WheelSizes.SIXTEEN),
                makeGasTank(60),
                makeEngine(true),
                makeElectric(true),
                makeHeadLights(true),
                true,
                makeMiniFridge(true));

        try {
            solara.startCar();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        solara.roofSwitch();
        solara.roofSwitch();
        solara.useMiniFridge();
        solara.stopCar();
        System.out.println();

        //Собираем Hiance
        Hiance hiance = new Hiance("silver",
                120,
                TransmissionTypes.MECHANICAL,
                false,
                25000,
                makeWheelsArray(WheelSizes.TWENTY),
                makeGasTank(0),
                makeEngine(false),
                makeElectric(true),
                makeHeadLights(true),
                2500,
                makeSpareWheel(WheelSizes.TWENTY, true));

        try {
            hiance.startCar();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        hiance.headLightsOn();
        hiance.headLightsOff();
        System.out.println();

        //Собираем Dyna
        Dyna dyna = new Dyna("brown",
                110,
                TransmissionTypes.MECHANICAL,
                false,
                22000,
                makeWheelsArray(WheelSizes.TWENTY),
                makeGasTank(75),
                makeEngine(true),
                makeElectric(true),
                makeHeadLights(true),
                1500,
                makeSocket(true));

        try {
            dyna.startCar();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        dyna.useSocket();
        dyna.stopCar();
    }

    static Wheel[] makeWheelsArray(WheelSizes wheelSizes) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(wheelSizes, true);
        }
        return wheels;
    }

    static GasTank makeGasTank(int countGas) {
        return new GasTank(countGas);
    }

    static Engine makeEngine(boolean condition) {
        return new Engine(condition);
    }

    static Electric makeElectric(boolean condition) {
        return new Electric(condition);
    }

    static HeadLights makeHeadLights(boolean condition) {
        return new HeadLights(condition);
    }

    static MusicUsb makeMusicUsb(boolean condition) {
        return new MusicUsb(condition);
    }

    static MiniFridge makeMiniFridge(boolean condition) {
        return new MiniFridge(condition);
    }

    static Wheel makeSpareWheel(WheelSizes wheelSizes, boolean condition) {
        return new Wheel(wheelSizes, condition);
    }

    static Socket makeSocket(boolean condition) {
        return new Socket(condition);
    }
}

