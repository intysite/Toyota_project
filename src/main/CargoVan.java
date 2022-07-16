package main;

import main.details.*;

public abstract class CargoVan extends Car {
    private int loadCapacity;

    public CargoVan(String color,
                    int maxSpeed,
                    TransmissionTypes transmissionType,
                    boolean isStart,
                    double price,
                    Wheel[] wheels,
                    GasTank gasTank,
                    Engine engine,
                    Electric electric,
                    HeadLights headLights,
                    int loadCapacity) {
        super(color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights);
        this.loadCapacity = loadCapacity;
    }
}
