package main;

import main.details.*;
import main.factory.Countries;

public abstract class PassengerCar extends Car{
    private boolean cruiseIsOn;

    public PassengerCar(Countries country,
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
                        boolean cruiseIsOn) {
        super(country, color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights);
        this.cruiseIsOn = cruiseIsOn;
    }

    public void cruiseOn() {
        System.out.println("Круиз-контроль включен");
        cruiseIsOn = true;
    }
    public void cruiseOff() {
        System.out.println("Круиз-контроль выключен");
        cruiseIsOn = false;
    }
}