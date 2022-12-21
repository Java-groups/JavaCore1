package com.edu.hometask5;


public class NonFlyingBird extends Bird {
    String smallWings = "Has a small wings";

    public NonFlyingBird() {
        super();
    }

    @Override
    String fly() {
        return "Can not fly";
    }
}
