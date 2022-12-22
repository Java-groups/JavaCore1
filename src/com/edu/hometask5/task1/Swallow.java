package com.edu.hometask5.task1;

public class Swallow extends FlyingBird {
    private String notPredatory = "Is not predator";

    public Swallow() {
        super();
    }

    @Override
    public String toString() {
        return "Swallow: " + notPredatory + ", " + getBigWings() + ", " + getFeathers() + ", " + getLayEggs() + ';';
    }
}
