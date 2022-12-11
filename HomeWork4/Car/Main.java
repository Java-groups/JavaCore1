package edu.homeworks.hw4.Car;

import edu.homeworks.hw4.IntegerNumbers.IntegerNumbers;
import edu.homeworks.hw4.Month.Months;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car[] cars = new Car[5];
        cars[0] = new Car("BMW",2000,400);
        cars[1] = new Car("Toyota",1999,300);
        cars[2] = new Car("Nissan",2001,300);
        cars[3] = new Car("MB",1999,300);
        cars[4] = new Car("Doodge",1999,300);
        Car.sortedByYear(input,cars);
        Car.sortedByBubbleSort(cars);
    }
}