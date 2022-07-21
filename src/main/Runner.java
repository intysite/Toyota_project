package main;

import main.factory.*;
import main.warehouse.*;

public class Runner {
    public static void main(String[] args) {

        //Создаем производство
        Factory factory = new Factory(Countries.JAPAN);
        Conveyor conveyor = null;
        try {
            conveyor = new Conveyor(Countries.JAPAN, factory);
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }

        //Собираем и тестируем Camry
        Camry camry = conveyor.createCamry(Countries.JAPAN, "black", 40000);
        //Заправка
        camry.setFuel(50);
        try {
            camry.startCar();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        camry.headLightsOn();
        camry.cruiseOn();
        camry.musicUsbOn();
        camry.stopCar();
        System.out.println();

        //Собираем и тестируем Solara
        Solara solara = conveyor.createSolara(Countries.JAPAN, "white", 45000);
        solara.setFuel(60);
        try {
            solara.startCar();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        solara.roofSwitch();
        solara.roofSwitch();
        solara.useMiniFridge();
        solara.stopCar();
        System.out.println();

        //Собираем и тестируем Hiance
        Hiance hiance = conveyor.createHiance(Countries.JAPAN, "silver", 30000);
        hiance.setFuel(50);
        try {
            hiance.startCar();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        hiance.headLightsOn();
        hiance.headLightsOff();
        System.out.println();

        //Собираем и тестируем Dyna
        Dyna dyna = conveyor.createDyna(Countries.JAPAN, "brown", 35000);
        dyna.setFuel(45);
        try {
            dyna.startCar();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        dyna.useSocket();
        dyna.stopCar();
        System.out.println();

        // Создаем склад
        Warehouse warehouse = new Warehouse(Countries.JAPAN);
        try {
            //warehouse.setCamry(camry);
            warehouse.setSolara(solara);
            warehouse.setHiance(hiance);
            warehouse.setDyna(dyna);
            warehouse.getCamry();
        } catch (WrongValueWarehouseException e) {
            System.out.println(e.getMessage());
        }
        warehouse.getNumberOfHiance();
        warehouse.getNumberOfCamry();
        System.out.println("На складе " + warehouse.getNumberOfCars() + " шт. автомобилей.");

    }
}

