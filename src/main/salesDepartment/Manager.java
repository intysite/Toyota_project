package main.salesDepartment;

import main.*;
import main.factory.*;
import main.warehouse.*;

public class Manager {
    private String name;
    private Warehouse warehouse;
    private Conveyor conveyor;
    private Report report = new Report(name);

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
}
