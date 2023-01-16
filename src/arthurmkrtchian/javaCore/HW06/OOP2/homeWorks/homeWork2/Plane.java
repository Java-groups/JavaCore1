package arthurmkrtchian.javaCore.HW06.OOP2.homeWorks.homeWork2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("The plane is flying...");
    }

    @Override
    public void land() {
        System.out.println("The plane is landing...");

    }
}
