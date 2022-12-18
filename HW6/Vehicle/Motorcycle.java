import static java.lang.System.out;

public class Motorcycle extends GroundVehicle {
    private String maxSpeed;

    public Motorcycle(int passengers, String maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(String model) {
        this.maxSpeed = model;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void drive() {
        out.println("Motorcycle driving");
    }
}