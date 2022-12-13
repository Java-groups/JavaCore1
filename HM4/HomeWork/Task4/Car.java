package HM4.HomeWork.Task4;

public class Car {
    String type;
    int year;
    double engineCapacity;

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String toString() {
        return type + " " + engineCapacity;
    }
}
