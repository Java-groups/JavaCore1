package HW6.com.model.passangers.waterVehicle;

import HW6.com.model.passangers.vehicle.WaterVehicle;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passangers) {
        super(passangers);
    }


    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("I am not sailing I have " + getFloors() + " floors" + " and can have "+ getPassangers()+ " passangers");
    }
}
