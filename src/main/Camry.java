package main;

import main.details.*;
import main.factory.Countries;

public class Camry extends PassengerCar{
    private MusicUsb musicUsb;

    public Camry(Countries country,
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
                 boolean cruiseIsOn,
                 MusicUsb musicUsb) {
        super(country, color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights, cruiseIsOn);
        this.musicUsb = musicUsb;
    }

    public void musicUsbOn() {
        System.out.println("Музыка включена");
        musicUsb.setMusicIsOn(true);
    }

    public void musicUsbOff() {
        System.out.println("Музыка выключена");
        musicUsb.setMusicIsOn(false);
    }
}
