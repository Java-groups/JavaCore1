package HW6.Task2;

public class Car extends GroundVehicle{
    private String model;

    public Car(int passengers) {
        super(passengers);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model = '" + model + '\'' + ", passengers = " + getPassengers() +
                '}';
    }
}
