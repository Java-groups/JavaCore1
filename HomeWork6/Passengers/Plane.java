package edu.homeworks.hw6.Passengers;

public class Plane extends FlyingVehicle{
    int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
    public void Plane(int maxDistance,int passengers){
        this.maxDistance = maxDistance;
        this.passengers = passengers;
    };

    @Override
    public void fly(){
        System.out.println("Your Max Distance fly = " + maxDistance+
                "\n Your passengers = "  + getPassengers());
    };

    @Override
    public void land(){};
}
