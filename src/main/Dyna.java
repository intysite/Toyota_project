package main;

import main.details.*;
import main.factory.Countries;

public class Dyna extends CargoVan{

    private Socket socket;

    public Dyna(Countries country,
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
                Socket socket) {
        super(country, color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights, loadCapacity);
        this.socket = socket;
    }

    public void useSocket() {
        System.out.println("Телефон заряжается");
    }
}
