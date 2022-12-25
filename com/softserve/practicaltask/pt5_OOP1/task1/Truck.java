package com.softserve.practicaltask.pt5_OOP1.task1;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public String toString() {
        return "Truck details" + '\n' +
                "Model: " + getModel() + '\n' +
                "Max speed: " + getMaxSpeed() + '\n' +
                "Year of manufacture: " + getYearOfManufacture();
    }
}
