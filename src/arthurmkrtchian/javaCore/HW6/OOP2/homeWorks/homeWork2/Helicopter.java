package arthurmkrtchian.javaCore.HW6.OOP2.homeWorks.homeWork2;

public class Helicopter extends FlyingVehicle{

    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("The helicopter is flying...");
    }

    @Override
    public void land() {
        System.out.println("The helicopter is landing...");

    }
}
