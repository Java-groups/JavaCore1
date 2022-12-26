package com.softserve.hw4.Car2;

public class Car {
    private String type;
    private int productionYear;
    private double engineCapacity;
    static final int CAR_TYPES_COUNT = 3;

    public Car() {}
    public Car(String type, double engineCapacity, int productionYear) {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}
