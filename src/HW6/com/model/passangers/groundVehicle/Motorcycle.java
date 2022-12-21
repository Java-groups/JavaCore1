package HW6.com.model.passangers.groundVehicle;

import HW6.com.model.passangers.vehicle.GroundVehicle;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passangers) {
        super(passangers);
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Driving motorsycle with max speed "+ getMaxSpeed());
    }
}
