package com.edu.hometask4.task4;


import java.util.Scanner;

public class CarStarter {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Car[] cars = new Car[4];
        cars[0] = new Car("Volvo", 1974, 90);
        cars[1] = new Car("Saab", 2015, 260);
        cars[2] = new Car("BMW", 2000, 250);
        cars[3] = new Car("Renault", 2018, 70);

        Car.listCarByYear(Car.findCarByYear(Car.inputYear(sc), cars), cars);
    }
}

