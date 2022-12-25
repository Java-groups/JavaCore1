package AllHomeWorks.HomeWork6.Task2;

public class Car extends GroundVehicle{
    public String model;

    public Car(int passengers, String model) {
        super(passengers);
        setModel(model);
        drive();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    void drive() {
        if (!model.equals(" ")){
            isDriving = true;
        }
    }

    public String toString() {
        return String.format("%s, model = %s: ", super.toString(), getModel());
    }
}
