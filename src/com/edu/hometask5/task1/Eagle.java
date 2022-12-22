package com.edu.hometask5.task1;


public class Eagle extends FlyingBird {
    private String predator = "It is predator";

    public Eagle() {
        super();
    }

    @Override
    public String toString() {
        return "Eagle: "+ predator +", " + getBigWings() +", " + getFeathers() + ", " + getLayEggs() + ';';

    }
}
