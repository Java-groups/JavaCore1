package HW6.Task2;

abstract public class FlyingVehicle extends Passengers implements Vechicle{
    public FlyingVehicle(int passengers) {
        super(passengers);
    }
    public void fly() {
        System.out.println("can fly");
    }
    public void land() {
        System.out.println("can land");
    }
}
