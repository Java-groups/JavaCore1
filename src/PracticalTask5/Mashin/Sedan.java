package PracticalTask5.Mashin;



public class Sedan extends Car {


    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String run() {
        return "sedan run of 10";
    }

    @Override
    public String stop() {
        return "sedan stop of 18";
    }


}
