package HM5.PracticalTask1;

import HM4.HomeWork.Task4.Car;

public class Sedan extends Car1 {

    Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    void run() {
        System.out.println("I'm running");
    }

    @Override
    void stop() {
        System.out.println("I'm stopping");
    }

    @Override
    public String toString() {
        return "model: " + this.model + "; Max speed: " + this.maxSpeed + "; Year: " + this.yearOfManufacture + "\n";
    }
}
