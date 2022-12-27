package com.softserve.hw4.Car2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarService {

    static final int CAR_TYPES_COUNT = 3;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    Car[] cars = new Car[CAR_TYPES_COUNT];

    public void inputCarInfo() throws IOException {
        for (int i = 0; i < CAR_TYPES_COUNT; i++) {
            Car car = new Car();

            System.out.println("Input car type: ");
            car.setType(input.readLine());
            System.out.println("Input production year: ");
            car.setProductionYear(Integer.parseInt(input.readLine()));
            System.out.println("Input engine capacity: ");
            car.setEngineCapacity(Double.parseDouble(input.readLine()));

            cars[i] = car;
        }
    }

    public void outputCarInfo() {
        for (int i = 0; i < CAR_TYPES_COUNT; i++) {
            System.out.println("Car info: " + cars[i]);
        }
    }

    public void certainModelYear() throws IOException {
        int inputProductionYear;
        System.out.println("Input model production year: ");
        inputProductionYear = Integer.parseInt(input.readLine());
        for (int i = 0; i < CAR_TYPES_COUNT; i++) {
            if (cars[i].getProductionYear() == inputProductionYear) {
                System.out.println("Car by year: " + cars[i]);
                break;
            }
        }
    }

    public void sortByYear() {
        System.out.println("Cars sorted by year of production: ");
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getProductionYear() > cars[j].getProductionYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
    }
}
