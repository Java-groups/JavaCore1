package com.softserve.hw5.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CarService extends Car{
//    Car car = new Car();

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void setCarType() throws IOException {
        System.out.println("Input car type: ");
        for (int i = 0; i < getType().length; i++) {
            String[] carType = new String[getType().length];
            carType[i] = (input.readLine());
            setType(carType);
        }
    }

    public void setCarProductionYear() throws IOException {
        System.out.println("Please, input car production year: ");
        for (int i = 0; i < getProductionYear().length; i++) {
            int[] productionYear = new int[getProductionYear().length];
            productionYear[i] = (Integer.parseInt(input.readLine()));
            setProductionYear(productionYear);
        }
    }

    public void setCarEngineCapacity() throws IOException {
        System.out.println("Please, input car engine capacity: ");
        for (int i = 0; i < getEngineCapacity().length; i++) {
            double[] engineCapacity = new double[getEngineCapacity().length];
            engineCapacity[i] = (Double.parseDouble(input.readLine()));
            setEngineCapacity(engineCapacity);
        }
    }

    public void certainModelYearCars() throws IOException {
        System.out.println("Please, input car production year to display cars: ");
        int year = Integer.parseInt(input.readLine());
        String type = null;
        double engine = 0;
        for (int i = 0; i < getProductionYear().length; i++) {
            if (year == getProductionYear()[i]) {
                    year = getProductionYear()[i];
                    type = getType()[i];
                    engine = getEngineCapacity()[i];
            }
        }
        System.out.println("Car type: " + type + " Engine: " + engine + " Year: " + year);
    }

    public void carsYearSort() {
        Arrays.sort(getProductionYear());
        System.out.println("Cars sorted by year of production: " + toString());
    }
}
