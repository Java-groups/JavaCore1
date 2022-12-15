package PracticalTask5.Mashin;

// Create abstract class Car with model, maxSpeed and yearOfManufacture
// properties and run() and stop() methods.

abstract public class Car {

    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" +
                "model = '" + model + '\'' +
                ", maxSpeed = '" + maxSpeed + '\'' +
                ", yearOfManufacture = '" + yearOfManufacture + '\'' +
                ']';
    }

    public abstract String run();

    public abstract String stop();


}
