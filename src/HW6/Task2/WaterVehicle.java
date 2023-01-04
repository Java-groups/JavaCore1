package HW6.Task2;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle(int passengers) {
        super(passengers);
    }
    public abstract void isSailing();
}