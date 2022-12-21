package com.edu.hometask5;


public class Penguin extends NonFlyingBird {
    private String swim = "Can swim";

    public Penguin() {
        super();
    }

    @Override
    public String toString() {
        return "Penguin: " + swim + ", " + smallWings + ", "  + feathers + ", " + layEggs+";";

    }
}

