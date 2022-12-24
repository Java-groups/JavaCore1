package HM7.Task2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    Motorcycle(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {}

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
