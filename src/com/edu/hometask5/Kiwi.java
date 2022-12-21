package com.edu.hometask5;


public class Kiwi extends NonFlyingBird {
    private String run = "Can run fast";

    public Kiwi() {
        super();
    }

    @Override
    public String toString() {
        return "Kiwi: " + run + ", " + smallWings + ", " + feathers + ", " + layEggs + ';';

    }
}

