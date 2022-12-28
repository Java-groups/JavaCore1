package arthurmkrtchian.javaCore.HW5.OOP1.practicalTasks.practicalTask1;

public class Truck extends Car{
    int loadCapacity;

    public Truck(Model model, int maxSpeed, int yearOfManufacture, int loadCapacity) {
        super(model, maxSpeed, yearOfManufacture);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model: " + model +
                ", maxSpeed: " + maxSpeed +
                ", yearOfManufacture: " + yearOfManufacture +
                ", loadCapacity: " + loadCapacity +
                '}';
    }

    public Truck() {
    }

    @Override
    protected void run() {
        super.run();
        System.out.println("It is TRUCK running");
    }

    @Override
    protected void stop() {
        super.stop();
        System.out.println("It is TRUCK parked");
    }
}
