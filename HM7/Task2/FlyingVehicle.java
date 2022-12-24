package HM7.Task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{

    FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract void fly();
    abstract void land();
}
