package AllHomeWorks.HomeWork6.Task2;

public class Motorcycle extends GroundVehicle{

    public int maxSpeed;

    public Motorcycle(int passengers,  int maxSpeed) {
        super(passengers);
        setMaxSpeed(maxSpeed);
        drive();
    }
    @Override
    void drive() {
         isDriving = getMaxSpeed() > 0;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String toString() {
        return String.format("%s, max speed = %d: ", super.toString(), getMaxSpeed());
    }
}
