package main.salesDepartment;

public class Customer {
    private int customersMoney;
    private String customersName;

    public Customer(int customersMoney, String customersName) {
        this.customersMoney = customersMoney;
        this.customersName = customersName;
    }

    public int getCustomersMoney() {
        return customersMoney;
    }

    public void setCustomersMoney(int customersMoney) {
        this.customersMoney = customersMoney;
    }

    public String getCustomersName() {
        return customersName;
    }
}
