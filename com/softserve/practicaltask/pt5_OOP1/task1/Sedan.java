package com.softserve.practicaltask.pt5_OOP1.task1;

public class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("The car is running");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping");
    }
}
