package main.salesDepartment;

import main.*;
import main.factory.*;
import main.warehouse.*;

public class Manager {
    private Warehouse warehouse;
    private Conveyor conveyor;

    public Manager(Warehouse warehouse, Conveyor conveyor) {
        this.warehouse = warehouse;
        this.conveyor = conveyor;
    }

    public  <T extends Car> T sellCar(Customer customer) throws NotEnoughMoneyException {
        try {
            if (customer.getCustomersMoney() >= 22_000) {
                return (T) warehouse.getDyna();
            } else if (customer.getCustomersMoney() >= 15_000) {
                return (T) warehouse.getHiance();
            } else if (customer.getCustomersMoney() >= 12_000) {
                return (T) warehouse.getSolara();
            } else if (customer.getCustomersMoney() >= 10_000) {
                return (T) warehouse.getCamry();
            } else {
                throw new NotEnoughMoneyException("Недостаточно средств для покупки автомобиля");
            }
        } catch (WrongValueWarehouseException e) {
            if (customer.getCustomersMoney() >= 22_000) {
                return (T) conveyor.createDyna(Countries.JAPAN, "black", 22_000);
            } else if (customer.getCustomersMoney() >= 15_000) {
                return (T) conveyor.createHiance(Countries.JAPAN, "black", 15_000);
            } else if (customer.getCustomersMoney() >= 12_000) {
                return (T) conveyor.createSolara(Countries.JAPAN, "white", 12_000);
            } else {
                return (T) conveyor.createCamry(Countries.JAPAN, "black", 10_000);
            }
        }
    }
}
