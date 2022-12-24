package HW4.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Car("Volkswagen", 2021, 2.0);
        cars[1] = new Car("Renault", 2020, 2.0);
        cars[2] = new Car("Toyota", 2017, 2.5);
        cars[3] = new Car("Peugeot", 2020, 1.6);

      //  Arrays.sort(yearOfProduction);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year of car production: ");
        int enteredYear = sc.nextInt();
        for (Car car : cars) {
            if (enteredYear == car.getYearOfProduction()) {
                System.out.print(car);
            }
        }
        sort(cars);
        System.out.print(Arrays.toString(cars));
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

