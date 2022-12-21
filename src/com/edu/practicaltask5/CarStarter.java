package com.edu.practicaltask5;

import java.util.Arrays;

public class CarStarter {


    @Override
    public String toString() {
        return "CarStarter{}";
    }

    public static void main(String[] args) {

        Car[] cars = new Car[2];
        cars[0] = new Sedan("Volvo", 200, 1998);
        cars[1] = new Truck("Scania", 170, 2007);

        System.out.println(Arrays.toString(cars));
    }
}
