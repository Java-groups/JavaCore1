package com.edu.hometask5;

public class Swallow extends FlyingBird {
    private String notPredatory = "Is not predator";


    public Swallow() {
        super();
    }

    @Override
    public String toString() {
        return "Swallow: " + notPredatory + ", " + bigWings  + ", " + feathers + ", " + layEggs + ';';
    }
}
