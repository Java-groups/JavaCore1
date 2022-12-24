package HM7.Task2;

public abstract class GroundVehicle extends Passengers implements Vehicle{

    GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
