package AllHomeWorks.HomeWork5Practical.Task2;

public class Sedan extends Car{
    public Sedan (String model, int maxSpeed, int yearOfManufacture){
        super(model, maxSpeed, yearOfManufacture);
    }
    @Override
    public void run() {
        System.out.println("Sedan is running");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stopped. Ma[Speed is - " +maxSpeed);
    }
}
