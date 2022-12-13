package HM4.HomeWork.Task4;

import java.util.Arrays;
import java.util.Scanner;

//Task description
//        Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//        certain model year  (enter year in the console);
//        ordered by the field year.


public class Main {
    public static void main(String[] args) {
        Car Car1 = new Car("Sedan", 1995, 1.5);
        Car Car2 = new Car("Crossover", 2005, 2.0);
        Car Car3 = new Car("Hatchback", 1985, 1.2);
        Car Car4 = new Car("Minivan", 2012, 2.1);
        Car[] cars = {Car1, Car2, Car3, Car4};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year");
        int input = sc.nextInt();

        for (int i = 0; i < cars.length; i++) {
            if (input == cars[i].year) {
                System.out.println(cars[i].toString());
            }
        }

        Car temp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i +1; j < cars.length; j++) {
                if (cars[i].year > cars[j].year) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println("\nCars ordered by the year");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
