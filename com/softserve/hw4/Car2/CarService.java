package com.softserve.hw4.Car2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarService extends Car {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void inputCarInfo() throws IOException {
        System.out.println("Input car type: ");
        setType(input.readLine());
        System.out.println("Input production year: ");
        setProductionYear(Integer.parseInt(input.readLine()));
        System.out.println("Input engine capacity: ");
        setEngineCapacity(Double.parseDouble(input.readLine()));
    }

    public void objectCarInfo() {
        Car car1 = new Car(getType(), getEngineCapacity(), getProductionYear()); //But how to do this with for()?
        for (int i = 0; i < CAR_TYPES_COUNT; i++) {

        }
    }
}
