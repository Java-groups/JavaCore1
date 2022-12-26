package com.softserve.hw4.Car2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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


//
//    public void objectCarInfo() {
//        Car[] car = new Car[CAR_TYPES_COUNT];
//        for (int i = 0; i < CAR_TYPES_COUNT; i++) {
//            Car carInfo = new Car();
//            carInfo.setType(getType());
//            carInfo.setEngineCapacity(getEngineCapacity());
//            carInfo.setProductionYear(getProductionYear());
//
//            car[i] = carInfo;
//        }
//    }
}
