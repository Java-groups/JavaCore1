package com.edu.hometask6.task2;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {

        Passengers [] passengers = new Passengers[7];
        passengers[0] = new Liner(1000, 4);
        passengers[1] = new Boat(10,5);
        passengers[2] = new Plane(120, 1200);
        passengers[3] = new Helicopter(8, 1000, 2000);
        passengers[4] = new Bus(80, "route");
        passengers[5]=new Motorcycle(2,170);
        passengers[6]=new Car(5, "sedan");

        for (int i = 0; i< passengers.length; i++){
            System.out.println(passengers[i]);
        }
    }
}
