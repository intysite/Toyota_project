package main.salesDepartment;

import main.Camry;
import main.Car;

public class Report {
    private String nameOfManager;
    private Car[] cars;

    public Report(String nameOfManager) {
        this.nameOfManager = nameOfManager;
    }

    public String getNameOfManager() {
        return nameOfManager;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCar(Car car) {
        Car[] temp = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            temp[i] = cars[i];
        }
        temp[cars.length] = car;
        cars = temp;
    }
}
