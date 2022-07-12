package main.homework1;

import main.homework1.details.*;

public class Dyna extends CargoVan{

    private Socket socket;

    public Dyna(String color,
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
        super(color, maxSpeed, transmissionType, isStart, price, wheels, gasTank, engine, electric, headLights, loadCapacity);
        this.socket = socket;
    }

    public void useSocket() {
        System.out.println("Телефон заряжается");
    }
}
