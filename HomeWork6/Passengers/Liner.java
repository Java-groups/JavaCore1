package edu.homeworks.hw6.Passengers;

public class Liner extends WaterVehicle{
    int floors;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Liner(int floors,int passengers){
        this.floors = floors;
        this.passengers = passengers;
    };

    @Override
    public void isSailing(){
        System.out.println("It's not sailing boat" +
                "\n Your floors = " + getFloors()+
                "\n Your passengers = "  + getPassengers());
    };
}
