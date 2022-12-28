package com.softserve.practicaltask.pt5_OOP1.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] car = new Car[4];
        car[0] = new Sedan("Honda", 220, 2010);
        car[1] = new Sedan("Suzuki", 200, 2005);
        car[2] = new Truck("MAN", 140, 2015);
        car[3] = new Truck("Volvo", 160, 2005);
        int j = 1;
        for (int i = 0; i < car.length; i++) {
            System.out.println(String.format("The %d car info: ", j++) + car[i]);
        }
    }
}
