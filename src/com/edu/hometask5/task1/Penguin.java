package com.edu.hometask5.task1;


public class Penguin extends NonFlyingBird {
    private String swim = "Can swim";

    public Penguin() {
        super();
    }

    @Override
    public String toString() {
        return "Penguin: " + swim + ", " + getSmallWings() + ", "  + getFeathers() + ", " + getLayEggs()+";";

    }
}

