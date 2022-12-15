package edu.homeworks.hw6.Passengers;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    FlyingVehicle(){};
    abstract void fly();
    abstract void land();

}
