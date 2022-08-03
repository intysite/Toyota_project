package main.salesDepartment;

import main.*;
import main.factory.*;
import main.warehouse.*;

import java.io.FileWriter;
import java.io.IOException;

public class Manager {
    private String name;
    private Warehouse warehouse;
    private Conveyor conveyor;
    private Report report = new Report(name);
    private double priceSum = 0;
    private double selfPriceSum = 0;

    public Manager(String name, Warehouse warehouse, Conveyor conveyor) {
        this.name = name;
        this.warehouse = warehouse;
        this.conveyor = conveyor;
    }

    public String getName() {
        return name;
    }

    public  <T extends Car> T sellCar(Customer customer) throws NotEnoughMoneyException {
        try {
            if (customer.getCustomersMoney() >= 22_000) {
                Dyna dyna = warehouse.getDyna();
                report.setCar(dyna);
                return (T) dyna;
            } else if (customer.getCustomersMoney() >= 15_000) {
                Hiance hiance = warehouse.getHiance();
                report.setCar(hiance);
                return (T) hiance;
            } else if (customer.getCustomersMoney() >= 12_000) {
                Solara solara = warehouse.getSolara();
                report.setCar(solara);
                return (T) solara;
            } else if (customer.getCustomersMoney() >= 10_000) {
                Camry camry = warehouse.getCamry();
                report.setCar(camry);
                return (T) camry;
            } else {
                throw new NotEnoughMoneyException("Недостаточно средств для покупки автомобиля");
            }
        } catch (WrongValueWarehouseException e) {
            if (customer.getCustomersMoney() >= 22_000) {
                Dyna dyna = conveyor.createDyna(Countries.JAPAN, "black", 22_000);
                report.setCar(dyna);
                return (T) dyna;
            } else if (customer.getCustomersMoney() >= 15_000) {
                Hiance hiance = conveyor.createHiance(Countries.JAPAN, "black", 15_000);
                report.setCar(hiance);
                return (T) hiance;
            } else if (customer.getCustomersMoney() >= 12_000) {
                Solara solara = conveyor.createSolara(Countries.JAPAN, "white", 12_000);
                report.setCar(solara);
                return (T) solara;
            } else {
                Camry camry = conveyor.createCamry(Countries.JAPAN, "black", 10_000);
                report.setCar(camry);
                return (T) camry;
            }
        }
    }

    public void generateReport() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\Java_projects\\Toyota_project\\data\\report" + name + ".txt");
        fileWriter.write("Менеджер " + name + "\n");
        Car[] cars = report.getCars();
        for (Car car : cars) {
            double selfPrice = 0;
            if (car instanceof Dyna) {
                selfPrice = Catalog.DYNA.getSelfPrice();
            } else if (car instanceof Hiance) {
                selfPrice = Catalog.HIANCE.getSelfPrice();
            } else if (car instanceof Solara) {
                selfPrice = Catalog.SOLARA.getSelfPrice();
            } else if (car instanceof Camry) {
                selfPrice = Catalog.CAMRY.getSelfPrice();
            }
            String reporting = car.getClass().getSimpleName() + " - "
                    + String.valueOf(car.getPrice()) + " - "
                    + String.valueOf(selfPrice);
            fileWriter.write(reporting + "\n");
            priceSum += car.getPrice();
            selfPriceSum += selfPrice;
        }
        String reporting = "Итог: доходы - " + String.valueOf(priceSum) +
                            " расходы - " + String.valueOf(selfPriceSum) +
                            " прибыль - " + String.valueOf(priceSum - selfPriceSum);
        fileWriter.write(reporting + "\n");
        fileWriter.close();
    }

    public double getPriceSum() {
        return priceSum;
    }

    public double getSelfPriceSum() {
        return selfPriceSum;
    }
}
