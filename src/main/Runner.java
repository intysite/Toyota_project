package main;

import main.factory.*;
import main.salesDepartment.*;
import main.warehouse.*;

import java.io.IOException;

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
        Camry camry = conveyor.createCamry(Countries.JAPAN, "black", 10_000);
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
        Solara solara = conveyor.createSolara(Countries.JAPAN, "white", 12_000);
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
        Hiance hiance = conveyor.createHiance(Countries.JAPAN, "black", 15_000);
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
        Dyna dyna = conveyor.createDyna(Countries.JAPAN, "black", 22_000);
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
            warehouse.setCamry(camry);
            warehouse.setSolara(solara);
            warehouse.setHiance(hiance);
            warehouse.setDyna(dyna);
        } catch (WrongValueWarehouseException e) {
            System.out.println(e.getMessage());
        }
        warehouse.getNumberOfHiance();
        warehouse.getNumberOfCamry();
        System.out.println("На складе " + warehouse.getNumberOfCars() + " шт. автомобилей.");

        // Организовываем продажи
        Manager manager = new Manager("Andrew", warehouse, conveyor);
        Cashier cashier = new Cashier();
        Customer[] customers = {new Customer(10_000, "Alex"),
         new Customer(12_000, "Susie"),
        new Customer(15_000, "Tilda"),
        new Customer(22_000, "Mia"),
        new Customer(11_000, "Max"),
        new Customer(13_000, "Helga"),
        new Customer(8_000, "Otto"),
        new Customer(30_000, "Michael"),};

        for (Customer customer : customers) {
            try {
                cashier.payCar(manager.sellCar(customer));
            } catch (NotEnoughMoneyException e) {
                    System.out.println(e.getMessage());
                }
        }

        System.out.println("На складе " + warehouse.getNumberOfCars() + " шт. автомобилей.");
        System.out.println("Сумма средств от продажи автомобилей составляет " + cashier.getIncomeAccount());

        Boss boss = new Boss();
        try {
            manager.generateReport();
            boss.generateGlobalReport(new Manager[]{manager});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

