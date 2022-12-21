package HW6.com.model.passangers.flyingVehicle;

import HW6.com.model.passangers.vehicle.FlyingVehicle;

public class Helicopter extends FlyingVehicle {
    public Helicopter(int passangers) {
        super(passangers);
    }
    private int weight;
    private int maxHeight;

    @Override
    public void fly() {
        System.out.println("Flying helicopter");
    }

    @Override
    public void land() {
        System.out.println("Landing helicopter");
    }
}
