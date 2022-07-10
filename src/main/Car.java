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

    public void startCar() {
        boolean isProblem = false;
        for (Wheel wheel : wheels) {
            try {
                if (!(wheel instanceof Wheel)) {
                    isProblem = true;
                    throw new StartCarException("Ошибка: колесо отсутствует");
                }
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (!wheel.getWheelIsOk()) {
                    isProblem = true;
                    throw new StartCarException("Ошибка: колесо проколото");
                }
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            if (gasTank.getCountGas() == 0) {
                isProblem = true;
                throw new StartCarException("Ошибка: нет топлива");
            }
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (!electric.getElectricIsOk()) {
                isProblem = true;
                throw new StartCarException("Ошибка: электрика не исправна");
            }
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (!engine.getEngineIsOk()) {
                isProblem = true;
                throw new StartCarException("Ошибка: двигатель не исправен");
            }
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        if (!isProblem) {
            System.out.println("Автомобиль движется");
            setIsStart(true);
        }
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
