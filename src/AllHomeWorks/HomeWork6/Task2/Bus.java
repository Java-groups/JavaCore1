package AllHomeWorks.HomeWork6.Task2;

public class Bus extends GroundVehicle{
    public String route;

    public Bus(int passengers, String route) {
        super(passengers);
        setRoute(route);
        drive();
    }

    @Override
    void drive() {
        if (!route.equals(" ")){
            isDriving = true;
        }
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
    public String toString() {
        return String.format("%s, route = %s: ", super.toString(), getRoute());
    }
}
