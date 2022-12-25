package AllHomeWorks.HomeWork6.Task2;

abstract class FlyingVehicle extends Passengers implements Vehicle {
    protected boolean isFlying = false;
    public FlyingVehicle(int passengers){
        super(passengers);
    }

    abstract void fly();
    abstract void land();

    public String toString() {
        return String.format("%s, is flying: %s", super.toString(), isFlying);
    }

}
