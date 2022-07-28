package main.salesDepartment;

import main.Car;

public class Cashier {
    private static double incomeAccount = 0;

    public double getIncomeAccount() {
        return incomeAccount;
    }

    public void payCar(Car car) {
        incomeAccount += car.getPrice();
    }
}
