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
            throw new WrongValueWarehouseException("Автомобиля Camry на складе нет");
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

    public Solara getSolara() throws WrongValueWarehouseException {
        if (solaras.length > 0) {
            Solara solara = solaras[solaras.length - 1];
            Solara[] temp = new Solara[solaras.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = solaras[i];
            }
            solaras = temp;
            numberOfCars--;
            return solara;
        } else {
            throw new WrongValueWarehouseException("Автомобиля Solara на складе нет");
        }
    }

    public void setSolara(Solara solara) throws WrongValueWarehouseException {
        if(numberOfCars < 1000) {
            Solara[] temp = new Solara[solaras.length + 1];
            for (int i = 0; i < solaras.length; i++) {
                temp[i] = solaras[i];
            }
            temp[solaras.length] = solara;
            solaras = temp;
            numberOfCars++;
        } else {
            throw new WrongValueWarehouseException("Склад заполнен");
        }
    }

    public int getNumberOfSolara() {
        System.out.println("Количество автомобилей Solara на складе составляет " + solaras.length + " шт.");
        return solaras.length;
    }

    public Hiance getHiance() throws WrongValueWarehouseException {
        if (solaras.length > 0) {
            Hiance hiance = hiances[hiances.length - 1];
            Hiance[] temp = new Hiance[hiances.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = hiances[i];
            }
            hiances = temp;
            numberOfCars--;
            return hiance;
        } else {
            throw new WrongValueWarehouseException("Автомобиля Hiance на складе нет");
        }
    }

    public void setHiance(Hiance hiance) throws WrongValueWarehouseException {
        if(numberOfCars < 1000) {
            Hiance[] temp = new Hiance[hiances.length + 1];
            for (int i = 0; i < hiances.length; i++) {
                temp[i] = hiances[i];
            }
            temp[hiances.length] = hiance;
            hiances = temp;
            numberOfCars++;
        } else {
            throw new WrongValueWarehouseException("Склад заполнен");
        }
    }

    public int getNumberOfHiance() {
        System.out.println("Количество автомобилей Hiance на складе составляет " + hiances.length + " шт.");
        return hiances.length;
    }

    public Dyna getDyna() throws WrongValueWarehouseException {
        if (dynas.length > 0) {
            Dyna dyna = dynas[dynas.length - 1];
            Dyna[] temp = new Dyna[dynas.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = dynas[i];
            }
            dynas = temp;
            numberOfCars--;
            return dyna;
        } else {
            throw new WrongValueWarehouseException("Автомобиля Dyna на складе нет");
        }
    }

    public void setDyna(Dyna dyna) throws WrongValueWarehouseException {
        if(numberOfCars < 1000) {
            Dyna[] temp = new Dyna[dynas.length + 1];
            for (int i = 0; i < dynas.length; i++) {
                temp[i] = dynas[i];
            }
            temp[dynas.length] = dyna;
            dynas = temp;
            numberOfCars++;
        } else {
            throw new WrongValueWarehouseException("Склад заполнен");
        }
    }

    public int getNumberOfDyna() {
        System.out.println("Количество автомобилей Dyna на складе составляет " + dynas.length + " шт.");
        return dynas.length;
    }
}
