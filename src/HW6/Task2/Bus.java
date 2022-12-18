package HW6.Task2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(int passengers) {
        super(passengers);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public String toString() {
        return "Bus{" +
                "route = '" + route + '\'' + ", passengers = " + getPassengers() +
                '}';
    }
}
