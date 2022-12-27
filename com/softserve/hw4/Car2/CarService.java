package com.softserve.hw4.Car2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CarService extends Car {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    Car[] car = new Car[CAR_TYPES_COUNT];

    public void inputCarInfo() throws IOException {
        for (int i = 0; i < CAR_TYPES_COUNT; i++) {
            System.out.println("Input car type: ");
            setType(input.readLine());
            System.out.println("Input production year: ");
            setProductionYear(Integer.parseInt(input.readLine()));
            System.out.println("Input engine capacity: ");
            setEngineCapacity(Double.parseDouble(input.readLine()));

            Car carInfo = new Car();
            carInfo.setType(getType());
            carInfo.setEngineCapacity(getEngineCapacity());
            carInfo.setProductionYear(getProductionYear());

            car[i] = carInfo;
        }
    }

    public void outputCarInfo() {
        for (int i = 0; i < CAR_TYPES_COUNT; i++) {
            System.out.println("Car info: " + car[i]);
        }
    }

    public void certainModelYear() throws IOException {
        int inputProductionYear;
        System.out.println("Input model production year: ");
        inputProductionYear = Integer.parseInt(input.readLine());
        for (int i = 0; i < CAR_TYPES_COUNT; i++) {
            if (car[i].getProductionYear() == inputProductionYear) {
                System.out.println("Car by year: " + car[i]);
                break;
            }
        }
    }

    public void sortByYear() {
        System.out.println("Cars sorted by year of production: ");
        int maxYear = car[0].getProductionYear();
        for (int i = 1; i < CAR_TYPES_COUNT; i++) {
            if (car[i].getProductionYear() < maxYear) {
                car[i].setProductionYear(maxYear);
            }
        }
        toString();
    }
}
