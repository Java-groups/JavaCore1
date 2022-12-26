package com.softserve.hw5_oop1.birds.flyingbirds;

import com.softserve.hw5_oop1.Bird;

public class FlyingBird extends Bird {

    public FlyingBird(int feathers, int liedEggs) {
        super(feathers, liedEggs);
    }

    @Override
    public void fly() {
        String className = this.getClass().getSimpleName(); //Reflection
        System.out.println(className + ". Ancestor of Bird. Count of feathers " + feathers + " and lied eggs " + liedEggs);
    }
}
