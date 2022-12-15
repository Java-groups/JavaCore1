package edu.homeworks.hw6.Passengers;

public class Bus extends GroudVehicle{
    String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Bus(String route,int passengers){
        this.passengers = passengers;
        this.route = route;

    };

    @Override
    public void drive(){
        System.out.println("Your route = " + route + "\n Passengers = " + passengers);
    };


}
