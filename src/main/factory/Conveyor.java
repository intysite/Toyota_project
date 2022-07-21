package main.factory;

import main.*;
import main.details.WheelSizes;

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

    public Camry createCamry(Countries country, String color, double price) {
        return new Camry(country, color,
                240, TransmissionTypes.AUTOMATIC, false, price,
                factory.createWheelsArray(WheelSizes.SEVENTEEN), factory.createGasTank(), factory.createEngine(),
                factory.createElectric(), factory.createHeadLights(), false, factory.createMusicUsb());
    }

    public Solara createSolara(Countries country, String color, double price) {
        return new Solara(country, color, 250, TransmissionTypes.ROBOTIC, false, price,
                factory.createWheelsArray(WheelSizes.SIXTEEN), factory.createGasTank(), factory.createEngine(),
                factory.createElectric(), factory.createHeadLights(), true, factory.createMiniFridge());
    }

    public Hiance createHiance (Countries country, String color, double price) {
        return new Hiance(country, color, 160, TransmissionTypes.MECHANICAL, false, price,
                factory.createWheelsArray(WheelSizes.TWENTY), factory.createGasTank(), factory.createEngine(),
                factory.createElectric(), factory.createHeadLights(), 2500,
                factory.createSpareWheel(WheelSizes.TWENTY));
    }

    public Dyna createDyna (Countries country, String color, double price) {
        return new Dyna(country, color, 130, TransmissionTypes.MECHANICAL, false, price,
                factory.createWheelsArray(WheelSizes.TWENTY), factory.createGasTank(), factory.createEngine(),
                factory.createElectric(), factory.createHeadLights(), 1500, factory.createSocket());
    }
}
