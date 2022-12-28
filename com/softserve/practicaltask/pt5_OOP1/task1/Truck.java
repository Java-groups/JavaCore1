package com.softserve.practicaltask.pt5_OOP1.task1;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("The truck is running");
    }

    @Override
    public void stop() {
        System.out.println("The truck is stopping");

    }

}
