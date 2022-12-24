package HM7.Task2;

public class Bus extends GroundVehicle{
    private String route;

    Bus(int passengers) {
        super(passengers);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {}
}
