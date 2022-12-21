package com.edu.hometask5;


public class Eagle extends FlyingBird {
    private String predator = "It is predator";

    public Eagle() {
        super();
    }

    @Override
    public String toString() {
        return "Eagle: "+ predator +", " + bigWings +", " + feathers + ", " + layEggs + ';';

    }
}
