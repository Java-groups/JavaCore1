package com.softserve.hw4.Car;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CarService cs = new CarService();
        cs.setCarType();
        cs.setCarEngineCapacity();
        cs.setCarProductionYear();
        cs.certainModelYearCars();
        cs.carsYearSort();
    }

}
