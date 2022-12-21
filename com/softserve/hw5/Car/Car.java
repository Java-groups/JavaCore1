package com.softserve.hw5.Car;

import java.util.Arrays;

public class Car {

    private String[] type = new String[5];
    private int[] productionYear = new int[5];
    private double[] engineCapacity = new double[5];

    public Car() {}


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Arrays.equals(type, car.type) && Arrays.equals(productionYear, car.productionYear) && Arrays.equals(engineCapacity, car.engineCapacity);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(type);
        result = 31 * result + Arrays.hashCode(productionYear);
        result = 31 * result + Arrays.hashCode(engineCapacity);
        return result;
    }
    @Override
    public String toString() {
        return "Car{" +
                "type=" + Arrays.toString(getType()) +
                ", productionYear=" + Arrays.toString(getProductionYear()) +
                ", engineCapacity=" + Arrays.toString(getEngineCapacity()) +
                '}';
    }
}
