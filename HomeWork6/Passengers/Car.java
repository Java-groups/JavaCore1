package edu.homeworks.hw6.Passengers;

public class Car extends GroudVehicle{
    String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model,int passengers){
        this.model = model;
        this.passengers = passengers;
    };

    @Override
    public void drive(){
        System.out.println(
                "Your model = " + getModel()+
                "\n Your passengers = "  + getPassengers());
    };
}
