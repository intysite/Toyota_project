package main;

import main.details.*;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private TransmissionTypes transmissionType;
    private boolean isStart;
    private double price;
    private Wheel[] wheels;
    private GasTank gasTank;
    private Engine engine;
    private Electric electric;
    private HeadLights headLights;

    public Car(String color,
               int maxSpeed,
               TransmissionTypes transmissionType,
               boolean isStart,
               double price,
               Wheel[] wheels,
               GasTank gasTank,
               Engine engine,
               Electric electric,
               HeadLights headLights) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.isStart = isStart;
        this.price = price;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electric = electric;
        this.headLights = headLights;
    }

    public boolean getIsStart() {
        return this.isStart;
    }

    public void setIsStart(boolean start) {
        this.isStart = start;
    }

    public void startCar() throws StartCarException {
        String problemMessage = "";
        if (!checkWheels()) {
           problemMessage += "Ошибка: колесо не в порядке;\n";
                }
        if (gasTank.getCountGas() == 0) {
            problemMessage += "Ошибка: нет топлива;\n";
            }
        if (!electric.getElectricIsOk()) {
            problemMessage += "Ошибка: электрика не исправна; \n";
            }
        if (!engine.getEngineIsOk()) {
            problemMessage += "Ошибка: двигатель не исправен;\n";
            }
        if (!problemMessage.equals("")) {
            throw new StartCarException(problemMessage);
        }
        System.out.println("Автомобиль движется");
            setIsStart(true);
    }

    public boolean checkWheels() {
        if (wheels == null) {
            return false;
        } else if (wheels.length != 4) {
            return false;
        }

        for (Wheel wheel : wheels) {
            if (!wheel.getWheelIsOk()) {
                return false;
            }
        }
        return true;
    }

    public void stopCar() {
        System.out.println("Автомобиль остановился");
        setIsStart(false);
    }
    public void headLightsOn() {
        if(headLights.getHeadLightsIsOk()) {
            System.out.println("Фары включены");
        }
    }

    public void headLightsOff() {
        if(headLights.getHeadLightsIsOk()) {
            System.out.println("Фары выключены");
        }
    }
}
