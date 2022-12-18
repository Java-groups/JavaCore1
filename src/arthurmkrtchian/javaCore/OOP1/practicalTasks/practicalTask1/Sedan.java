package arthurmkrtchian.javaCore.OOP1.practicalTasks.practicalTask1;

public class Sedan extends Car{
    @Override
    protected void run() {
        super.run();
        System.out.println("It is SEDAN running");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model: " + model +
                ", maxSpeed: " + maxSpeed +
                ", yearOfManufacture: " + yearOfManufacture +
                '}';
    }

    public Sedan(Model model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    public Sedan() {
    }

    @Override
    protected void stop() {
        super.stop();
        System.out.println("It is SEDAN parked");
    }
}
