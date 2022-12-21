package HW6.com.model.passangers.groundVehicle;

import HW6.com.model.passangers.vehicle.GroundVehicle;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passangers) {
        super(passangers);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving the car "+ getModel() + " with " + getPassangers() + " passangers");
    }
}
