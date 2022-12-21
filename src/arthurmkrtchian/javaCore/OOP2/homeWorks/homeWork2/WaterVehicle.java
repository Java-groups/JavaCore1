package arthurmkrtchian.javaCore.OOP2.homeWorks.homeWork2;

public abstract class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}
