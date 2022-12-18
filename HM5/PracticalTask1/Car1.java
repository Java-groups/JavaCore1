package HM5.PracticalTask1;

public abstract class Car1 {
    protected String model;
    protected int maxSpeed;
    protected int yearOfManufacture;

    abstract void run();
    abstract void stop();

    public Car1(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }
}
