package HW6.Task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers) {
        super(passengers);
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance = " + maxDistance + ", passengers = " + getPassengers() +
                '}';
    }
}
