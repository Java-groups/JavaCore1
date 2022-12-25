package HM6.HomeWorkTask2;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
