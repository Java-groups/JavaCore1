package HW6.com.model.passangers.flyingVehicle;

import HW6.com.model.passangers.vehicle.FlyingVehicle;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passangers) {
        super(passangers);
    }


    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Flying plane");
    }

    @Override
    public void land() {
        System.out.println("Landing plane");
    }
}
