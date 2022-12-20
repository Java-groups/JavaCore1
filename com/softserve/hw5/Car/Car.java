package com.softserve.hw5.Car;

public class Car {

    private String[] type = new String[5];
    private int[] productionYear = new int[5];
    private double[] engineCapacity = new double[5];

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public int[] getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int[] productionYear) {
        this.productionYear = productionYear;
    }

    public double[] getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double[] engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
