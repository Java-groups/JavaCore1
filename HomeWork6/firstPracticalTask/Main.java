package edu.homeworks.hw6.firstPracticalTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Nike",4));
        animals.add(new Dog("Brownie",2));
        animals.get(0).feed();
        animals.get(1).feed();

    }
}