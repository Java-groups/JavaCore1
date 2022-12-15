package edu.homeworks.hw6.Passengers;

public class Main {
    public static void main(String[] args) {
        Passengers[] passengers = new Passengers[4];
        passengers[0] = new Bus("London",4);
        ((Bus)passengers[0]).drive();
        passengers[1] = new Car("Tesla",2);
        ((Car)passengers[1]).drive();
        passengers[2] = new Helicopter(100,100,4);
        ((Helicopter)passengers[2]).fly();
        passengers[3] = new Boat(100,2);
        ((Boat)passengers[3]).isSailing();

    }
}