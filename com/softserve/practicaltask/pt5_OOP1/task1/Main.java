package com.softserve.practicaltask.pt5_OOP1.task1;

public class Main {
    public static void main(String[] args) {
        Car[] car = new Car[4];
        car[0] = new Sedan();
        car[1] = new Sedan();
        car[2] = new Truck("MAN", 140, 2015);
        car[3] = new Truck("Volvo", 160, 2005);

        System.out.println(car[2].toString());
    }
}
