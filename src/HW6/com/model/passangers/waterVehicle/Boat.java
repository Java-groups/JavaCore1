package HW6.com.model.passangers.waterVehicle;

import HW6.com.model.passangers.vehicle.WaterVehicle;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passangers) {
        super(passangers);
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("I am sailing, my volume is "+ getVolume() + "with " + getPassangers() + " passangers");
    }
}
