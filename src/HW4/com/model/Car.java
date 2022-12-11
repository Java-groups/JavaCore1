package HW4.com.model;

public class Car {
    private String type;
    private int year;
    private float engine_capacity;

    public Car(String type, int year, float engine_capacity) {
        this.type = type;
        this.year = year;
        this.engine_capacity = engine_capacity;
    }

    public Car() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(float engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine_capacity=" + engine_capacity +
                '}';
    }
}
