package main.homework1;

import main.homework1.details.*;

public class Solara extends Cabriolet{
    private MiniFridge miniFridge;

    public Solara(String color,
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
        super(color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights, roofIsUp);
        this.miniFridge = miniFridge;
    }

    public void useMiniFridge() {
        System.out.println("Напиток охлаждается");
    }
}
