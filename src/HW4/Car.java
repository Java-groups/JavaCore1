package HW4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Car {
    private int year;
    private double engineCapacity;
    private String type;


    public Car(int year, double engineCapacity, String type) {
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", engineCapacity=" + engineCapacity +
                ", type='" + type + '\'' +
                '}';
    }
}
