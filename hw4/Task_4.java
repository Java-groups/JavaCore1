package hw4;

import Lesson5.Employee;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Car[] allCars = {
                new Car("Ford", 2007, 3.0),
                new Car("Jaguar", 2020, 3.5),
                new Car("Mercedes", 2022, 2.5),
                new Car("Toyota", 2020, 1.0)
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year of car production: ");
        int enteredYear = sc.nextInt();
        for (Car car : allCars) {
            if (enteredYear == car.getYearOfProduction()) {
                System.out.print(car);
            }
        }
        sort(allCars);
        System.out.print(Arrays.toString(allCars));
    }

    static void sort(Car[] arr) {
        Car tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getYearOfProduction() < arr[j].getYearOfProduction()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}

class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type = '" + type + '\'' +
                ", year of production = " + yearOfProduction +
                ", engine capacity = " + engineCapacity +
                '}';
    }
}
