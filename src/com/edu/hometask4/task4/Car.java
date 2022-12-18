package com.edu.hometask4.task4;

import java.util.Scanner;

public class Car {
    private String type;
    private int year;
    private double engine;

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getEngine() {
        return engine;
    }

    public Car(String type, int year, double engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }


    public static int inputYear(Scanner sc) throws Exception {


        System.out.println("Input the year of the production: ");

        int inputYear = sc.nextInt();
        return inputYear;

    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public static int findCarByYear(int inputYear, Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == inputYear) {

                System.out.println(
                        "Year: " + cars[i].getYear() +
                                " Type: " + cars[i].getType() +
                                " Engine capacity: " + cars[i].getEngine());
            }
        }
        return inputYear;
    }

    /*Bubble sorting, rewrite field year in the array "cars" only*/
    public static void listCarByYear(int index, Car[] cars) {

        int tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() < cars[j].getYear()) {
                    tmp = cars[i].getYear();
                    cars[i].year = cars[j].year;
                    cars[j].year = tmp;
                }
            }
        }
        System.out.println("List of the cars sorted by year:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(
                    "Year: " + cars[i].getYear() +
                            " Type: " + cars[i].getType() +
                            " Engine capacity: " + cars[i].getEngine());
        }
    }
}