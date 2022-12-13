package AllHomeWorks.HomeWork5Practical.Task2;

public abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfManufacture;

    abstract public void run();
    abstract public void stop();

    public Car(String model, int maxSpeed, int yearOfManufacture){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }
}
