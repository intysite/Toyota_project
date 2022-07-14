package main.homework2;

import main.homework1.*;
import main.homework1.details.WheelSizes;

public class Conveyor {
    private Countries country;
    private Factory factory;

    public Conveyor(Countries country, Factory factory) throws CountryFactoryNotEqualException {
        if(country != factory.getCountry()) {
            throw new CountryFactoryNotEqualException(
                    "Ошибка: фабрика деталей и сборочный конвейер находятся в разных странах");
        }
        this.country = country;
        this.factory = factory;
    }

    public Camry createCamry(String color, double price) {
        return new Camry(color,
                240, TransmissionTypes.AUTOMATIC, false, price,
                factory.createWheelsArray(WheelSizes.SEVENTEEN), factory.createGasTank(), factory.createEngine(),
                factory.createElectric(), factory.createHeadLights(), false, factory.createMusicUsb());
    }

    public Solara createSolara(String color, double price) {
        return new Solara(color, 250, TransmissionTypes.ROBOTIC, false, price,
                factory.createWheelsArray(WheelSizes.SIXTEEN), factory.createGasTank(), factory.createEngine(),
                factory.createElectric(), factory.createHeadLights(), true, factory.createMiniFridge());
    }

    public Hiance createHiance (String color, double price) {
        return new Hiance(color, 160, TransmissionTypes.MECHANICAL, false, price,
                factory.createWheelsArray(WheelSizes.TWENTY), factory.createGasTank(), factory.createEngine(),
                factory.createElectric(), factory.createHeadLights(), 2500,
                factory.createSpareWheel(WheelSizes.TWENTY));
    }

    public Dyna createDyna (String color, double price) {
        return new Dyna(color, 130, TransmissionTypes.MECHANICAL, false, price,
                factory.createWheelsArray(WheelSizes.TWENTY), factory.createGasTank(), factory.createEngine(),
                factory.createElectric(), factory.createHeadLights(), 1500, factory.createSocket());
    }

}
