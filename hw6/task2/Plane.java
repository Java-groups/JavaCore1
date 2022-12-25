package hw6.task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;
    @Override
    public void fly() {};
    public void land() {};

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
