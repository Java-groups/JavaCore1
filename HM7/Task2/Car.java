package HM7.Task2;

public class Car extends GroundVehicle{
    private String model;

    Car(int passengers) {
        super(passengers);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {}
}
