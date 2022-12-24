package HM7.Task2;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
