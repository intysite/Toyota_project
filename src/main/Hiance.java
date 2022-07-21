package main;

import main.details.*;
import main.factory.Countries;

public class Hiance extends CargoVan{
    private Wheel spareWheel;

    public Hiance(Countries country,
                  String color,
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
        super(country, color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights, loadCapacity);
        this.spareWheel = spareWheel;
    }
}
