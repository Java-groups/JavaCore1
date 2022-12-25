package com.edu.hometask6.task2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane fly");
    }

    @Override
    public void land() {
        System.out.println("Plane land");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
