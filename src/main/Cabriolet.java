package main;

import main.details.*;
import main.factory.Countries;

public abstract class Cabriolet extends Car {
    private boolean roofIsUp;

    public Cabriolet(Countries country,
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
                     boolean roofIsUp) {
        super(country, color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights);
        this.roofIsUp = roofIsUp;
    }

    public void roofSwitch() {
        if(roofIsUp) {
            System.out.println("Крыша опущена");
            roofIsUp = false;
        } else {
            System.out.println("Крыша поднята");
            roofIsUp = true;
        }
    }
}
