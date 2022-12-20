package com.softserve.hw5.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CarService {
    Car car = new Car();

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void setCarType() throws IOException {
        System.out.println("Input car type: ");
        for (int i = 0; i < car.getType().length; i++) {
            String[] carType = new String[car.getType().length];
            carType[i] = (input.readLine());
            car.setType(carType);
        }
    }

    public void setCarProductionYear() throws IOException {
        System.out.println("Please, input car production year: ");
        for (int i = 0; i < car.getProductionYear().length; i++) {
            int[] productionYear = new int[car.getProductionYear().length];
            productionYear[i] = (Integer.parseInt(input.readLine()));
            car.setProductionYear(productionYear);
        }
    }

    public void setCarEngineCapacity() throws IOException {
        System.out.println("Please, input car engine capacity: ");
        for (int i = 0; i < car.getEngineCapacity().length; i++) {
            double[] engineCapacity = new double[car.getEngineCapacity().length];
            engineCapacity[i] = (Double.parseDouble(input.readLine()));
            car.setEngineCapacity(engineCapacity);
        }
    }

    public void certainModelYearCars() throws IOException {
        System.out.println("Please, input car production year to display cars: ");
        int displayCars = Integer.parseInt(input.readLine());
        for (int i = 0; i < car.getProductionYear().length; i++) {
            if (displayCars == car.getProductionYear()[i]) {
                System.out.println("Car type: " + car.getType() + "\n Engine capacity: " + car.getEngineCapacity() + "\n Production year: " + car.getProductionYear());
            } else {
                System.out.println("There are no cars for this year!");
            }
        }
    }
    public void carsSortedByYear(String[] type, int[] productionYear, double[] engineCapacity) throws IOException {
        Car[] car = Arrays.sort(car.getProductionYear());
        System.out.println("Cars sorted by year of production: ");
        return;
    }
}
