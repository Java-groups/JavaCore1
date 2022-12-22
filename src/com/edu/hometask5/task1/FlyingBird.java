package com.edu.hometask5.task1;


public abstract class FlyingBird extends Bird {
    private String bigWings = "Have a big wings";

    public FlyingBird() {
        super();
    }

    public String getBigWings() {
        return bigWings;
    }

    @Override
    String fly() {
        return "Can fly";
    }
}
