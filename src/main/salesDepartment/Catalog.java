package main.salesDepartment;

public enum Catalog {
    CAMRY(5000),
    SOLARA(8000),
    HIANCE(10_000),
    DYNA(12_000);

    private double selfPrice;

    Catalog(double selfPrice) {
        this.selfPrice = selfPrice;
    }

    public double getSelfPrice() {
        return selfPrice;
    }
}
