package arthurmkrtchian.javaCore.HW06.OOP2.homeWorks.homeWork2;

public class Bus extends GroundVehicle {
    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("The bus is driving...");
    }
}
