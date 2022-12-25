package com.edu.hometask6.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{


    public FlyingVehicle(int passengers) {
        super(passengers);
    }
    public abstract void fly();

    public abstract void land();
}
