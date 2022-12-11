package edu.homeworks.hw4.Car;

import java.util.Scanner;

public class Car {
    private String type;
    private int year;
    private int engineCapacity;
    private static int tmp;

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

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    Car(String type,int year,int engineCapacity){
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    };
    public static void sortedByYear(Scanner input,Car[] cars){
        System.out.println("Write year : ");
        int number = input.nextInt();
        for (int i=0;i< cars.length;i++){
            if(number == cars[i].getYear()){
                System.out.println(
                        "\n Type:" + cars[i].getType() +
                        "\n Year:" + cars[i].getYear() +
                        "\n EngineCapacity:" + cars[i].getEngineCapacity());
            }
        }
    }

    public static void sortedByBubbleSort(Car[] cars) {
        int tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() > cars[j].getYear()) {
                    tmp = cars[i].getYear();
                    cars[i].year = cars[j].year;
                    cars[j].year = tmp;
                }
            }
        }
        System.out.println("Sorted list : ");
        for (int i=0;i<cars.length;i++){
            System.out.println(
                            "\n Type:" + cars[i].getType() +
                            "\n Year:" + cars[i].getYear() +
                            "\n EngineCapacity:" + cars[i].getEngineCapacity());
        }
    }
}
