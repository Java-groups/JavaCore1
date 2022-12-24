package HM7.Task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    Plane(int passengers) {
        super(passengers);
    }

    @Override
    void fly() {}

    @Override
    void land() {}

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
