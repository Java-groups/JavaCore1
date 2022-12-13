package AllHomeWorks.HomeWork5Practical.Task2;


public class Truck extends Car{
    public Truck (String model, int maxSpeed, int yearOfManufacture){
        super(model, maxSpeed, yearOfManufacture);
    }
    @Override
    public void run() {
        System.out.println("Truck is running");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped. MaxSpeed is - " +maxSpeed);
    }
}
