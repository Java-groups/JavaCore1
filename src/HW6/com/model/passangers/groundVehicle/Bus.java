package HW6.com.model.passangers.groundVehicle;

import HW6.com.model.passangers.vehicle.GroundVehicle;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passangers) {
        super(passangers);
    }


    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Drive bus with  "+ getPassangers() + " passangers, on the route "+ getRoute() );
    }
}
