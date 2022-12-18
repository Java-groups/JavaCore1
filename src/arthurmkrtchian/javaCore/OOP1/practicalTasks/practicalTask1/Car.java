package arthurmkrtchian.javaCore.OOP1.practicalTasks.practicalTask1;


//        1. Create abstract class Car with model, maxSpeed and yearOfManufacture
//        properties and run() and stop() methods.
//        2. Develop classes Truck and Sedan which extend class Car.
//        3. In main method create array of Car’s objects. Add to this array some
//        trucks and sedans and print info about it.


public class Car {
    protected Model model;
    protected int maxSpeed;
    protected int yearOfManufacture;

    public Car(Model model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model: " + model +
                ", maxSpeed: " + maxSpeed +
                ", yearOfManufacture: " + yearOfManufacture +
                '}';
    }

    protected void run(){
        System.out.println("Car is running...");
    }

    protected void stop(){
        System.out.println("Car is stopped.");
    }

    public Car() {
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
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
}
