package edu.homeworks.hw5.FirstPracticalTask;

public class Sedan extends Car {
    private  int passengers;

    Sedan(String model, int maxSpeed, int yearOfManufacture,int passengers) {
        super(model, maxSpeed, yearOfManufacture);
        this.passengers = passengers;
    }

    @Override
    void run() {
        System.out.println("Car running with " + passengers + " passengers"
                + " \n MaxSpeed " + getMaxSpeed() );
    }

    @Override
    void stop() {
        System.out.println("Car stopped");

    }
}
