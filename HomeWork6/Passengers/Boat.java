package edu.homeworks.hw6.Passengers;

public class Boat extends WaterVehicle{
    int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boat(int volume,int passengers){
        this.volume = volume;
        this.passengers = passengers;

    };

    @Override
    public void isSailing(){
        System.out.println("It's not sailing boat" +
                "\n Your volume = " + volume+
                "\n Your passengers = "  + getPassengers());
    };

}
