import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Object[] vehicles = new Object[]{
                new Liner(1000, 5),
                new Boat(4, 2000),
                new Helicopter(5, 5000, 5000),
                new Plane(100, 900),
                new Car(5, "x7"),
                new Bus(60, "B5"),
                new Motorcycle(2, "200")
        };
        for (Object vehicle : vehicles) {
            switch (String.valueOf(vehicle.getClass())) {
                case "class Liner":
                    Liner liner = (Liner) vehicle;
                    liner.isSailing();
                    out.println("Liner has "
                            + liner.getFloors()
                            + " floors and "
                            + liner.getPassengers()
                            + " passengers");
                    break;
                case "class Boat":
                    Boat boat = (Boat) vehicle;
                    boat.isSailing();
                    out.println("Boat has "
                            + boat.getVolume()
                            + " volume and "
                            + boat.getPassengers()
                            + " passengers");
                    break;
                case "class Helicopter":
                    Helicopter helicopter = (Helicopter) vehicle;
                    helicopter.fly();
                    out.println("Helicopter has "
                            + helicopter.getWeight()
                            + " weight and "
                            + helicopter.getPassengers()
                            + " passengers. Max height "
                            + helicopter.getMaxHeight());
                    helicopter.land();
                    break;
                case "class Plane":
                    Plane plane = (Plane) vehicle;
                    plane.fly();
                    out.println("Plane has "
                            + plane.getPassengers()
                            + " passengers. Max distance "
                            + plane.getMaxDistance());
                    plane.land();
                    break;
                case "class Car":
                    Car car = (Car) vehicle;
                    car.drive();
                    out.println("Car has "
                            + car.getPassengers()
                            + " passengers. Model "
                            + car.getModel());
                    break;
                case "class Bus":
                    Bus bus = (Bus) vehicle;
                    bus.drive();
                    out.println("Bus has "
                            + bus.getPassengers()
                            + " passengers. Route "
                            + bus.getRoute());
                    break;
                case "class Motorcycle":
                    Motorcycle motorcycle = (Motorcycle) vehicle;
                    motorcycle.drive();
                    out.println("Motorcycle has "
                            + motorcycle.getPassengers()
                            + " passengers. Max speed "
                            + motorcycle.getMaxSpeed());
                    break;
            }
        }
    }
}
