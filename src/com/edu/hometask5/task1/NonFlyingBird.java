package com.edu.hometask5.task1;


public abstract class NonFlyingBird extends Bird {
    private String smallWings = "Has a small wings";

    public String getSmallWings() {
        return smallWings;
    }

    public NonFlyingBird() {
        super();
    }

    @Override
    String fly() {
        return "Can not fly";
    }
}
