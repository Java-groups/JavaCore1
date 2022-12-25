package AllHomeWorks.HomeWork6.Task2;

public class Plane extends FlyingVehicle{

    protected int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        setMaxDistance(maxDistance);
        fly();
    }

    @Override
    void fly() {
        isFlying = getMaxDistance() > 0;
    }

    @Override
    void land() {
        isFlying = false;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public String toString() {
        return String.format("%s, max distance = %d:", super.toString(), getMaxDistance());
    }
}
