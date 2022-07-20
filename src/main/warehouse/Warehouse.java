package main.warehouse;

import main.*;
import main.factory.Countries;

public class Warehouse {
    private int numberOfCars = 0;
    private Countries country;
    private Camry[] camries = new Camry[0];
    private Solara[] solaras = new Solara[0];
    private Hiance[] hiances = new Hiance[0];
    private Dyna[] dynas = new Dyna[0];

    public Warehouse(Countries country) {
        this.country = country;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public Camry getCamry() throws WrongValueWarehouseException {
        if (camries.length > 0) {
            Camry camry = camries[camries.length - 1];
            Camry[] temp = new Camry[camries.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = camries[i];
            }
            camries = temp;
            numberOfCars--;
            return camry;
        } else {
            throw new WrongValueWarehouseException("Такого автомобиля на складе нет");
        }
    }

    public void setCamry(Camry camry) throws WrongValueWarehouseException {
        if(numberOfCars < 1000) {
            Camry[] temp = new Camry[camries.length + 1];
            for (int i = 0; i < camries.length; i++) {
                temp[i] = camries[i];
            }
            temp[camries.length] = camry;
            camries = temp;
            numberOfCars++;
        } else {
            throw new WrongValueWarehouseException("Склад заполнен");
        }
    }

    public int getNumberOfCamry() {
        System.out.println("Количество автомобилей Camry на складе составляет " + camries.length + " шт.");
        return camries.length;
    }
}
