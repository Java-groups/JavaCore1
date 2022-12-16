package Lesson6.practical1;

public class CarsApp {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Sedan("BMW", 240, 2022);
        cars[1] = new Sedan("Toyota", 150, 2021);
        cars[2] = new Truck("MAN", 120, 2000);
        for (Car el : cars) {
            System.out.println(el.toString());
        }
    }
}
