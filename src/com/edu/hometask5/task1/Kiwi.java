package com.edu.hometask5.task1;


public class Kiwi extends NonFlyingBird {
    private String run = "Can run fast";

    public Kiwi() {
        super();
    }

    @Override
    public String toString() {
        return "Kiwi: " + run + ", " + getSmallWings() + ", " + getFeathers() + ", " + getLayEggs() + ';';

    }
}

