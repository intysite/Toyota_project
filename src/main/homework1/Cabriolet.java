package main.homework1;

import main.homework1.details.*;

public abstract class Cabriolet extends Car {
    private boolean roofIsUp;

    public Cabriolet(String color,
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
        super(color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights);
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
