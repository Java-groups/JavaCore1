package edu.homeworks.hw6.Passengers;

public class Helicopter extends FlyingVehicle{
    int weight;
    int maxHeight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Helicopter(int weight, int maxHeight, int passengers){
        this.weight = weight;
        this.maxHeight = maxHeight;
        this.passengers = passengers;
    };

    @Override
    public void fly(){
        System.out.println(
                "Your MaxHeight = " + maxHeight+
                "\n Your passengers = "  + getPassengers());
    }
    @Override
    public void land(){
        System.out.println(
                "Your weight = " + weight+
                "\n Your passengers = "  + getPassengers());
    }
}
