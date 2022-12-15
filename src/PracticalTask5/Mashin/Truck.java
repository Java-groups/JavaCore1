package PracticalTask5.Mashin;

public class Truck extends Car {


    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String run() {
        return "truck run of 7";
    }

    @Override
    public String stop() {
        return "truck stop of 20";
    }
}
