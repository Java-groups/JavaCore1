package Lesson6.practical1;

public abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void run() {
    }

    public void stop() {
    }
}
