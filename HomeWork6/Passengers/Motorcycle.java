package edu.homeworks.hw6.Passengers;

public class Motorcycle extends GroudVehicle{
    int MaxSpeed;

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public Motorcycle(int MaxSpeed,int passengers){
        this.passengers = passengers;
        this.MaxSpeed = MaxSpeed;
    };

    @Override
    public void drive(){
        System.out.println("Your Max Speed = " + getMaxSpeed() + "\n Your passengers = " + getPassengers());
    };
}
