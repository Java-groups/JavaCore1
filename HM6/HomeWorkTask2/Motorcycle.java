package HM6.HomeWorkTask2;

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
