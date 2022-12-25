package edu.homeworks.hw5.FirstPracticalTask;

public class Truck extends Car {
    private int maxWeight;

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    Truck(String model, int maxSpeed, int yearOfManufacture, int maxWeight) {
        super(model, maxSpeed, yearOfManufacture);
        this.maxWeight = maxWeight;
    }

    @Override
    void run() {
        System.out.println("Truck is running \n With MaxSpeed " +getMaxSpeed() );

    }

    @Override
    void stop() {
        System.out.println("Truck is stopped" );

    }
}
