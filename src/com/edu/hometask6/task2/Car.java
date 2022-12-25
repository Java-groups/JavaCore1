package com.edu.hometask6.task2;

public class Car extends GroundVehicle{

    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car drive");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model +'\''+", passengers="+getPassengers()+
                '}';
    }
}
