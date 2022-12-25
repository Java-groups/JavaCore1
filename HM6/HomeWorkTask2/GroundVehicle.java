package HM6.HomeWorkTask2;

public abstract class GroundVehicle extends Passengers implements Vehicle{

    GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
