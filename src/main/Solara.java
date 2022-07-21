package main;

import main.details.*;
import main.factory.Countries;

public class Solara extends Cabriolet{
    private MiniFridge miniFridge;

    public Solara(Countries country,
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
                  boolean roofIsUp,
                  MiniFridge miniFridge) {
        super(country, color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights, roofIsUp);
        this.miniFridge = miniFridge;
    }

    public void useMiniFridge() {
        System.out.println("Напиток охлаждается");
    }
}
