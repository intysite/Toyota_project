package main.homework1;

import main.homework1.details.*;

public class Hiance extends CargoVan{
    private Wheel spareWheel;

    public Hiance(String color,
                  int maxSpeed,
                  TransmissionTypes transmissionType,
                  boolean isStart,
                  double price,
                  Wheel[] wheels,
                  GasTank gasTank,
                  Engine engine,
                  Electric electric,
                  HeadLights headLights,
                  int loadCapacity,
                  Wheel spareWheel) {
        super(color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights, loadCapacity);
        this.spareWheel = spareWheel;
    }
}
