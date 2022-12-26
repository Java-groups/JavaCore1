package com.softserve.hw5_oop1.birds.nonflyingbirds;

import com.softserve.hw5_oop1.birds.Bird;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(int feathers, int liedEggs) {
        super(feathers, liedEggs);
    }

    @Override
    public void fly() {
        String className = this.getClass().getSimpleName(); //Reflection
        System.out.println(className + ". Ancestor of Bird. Count of feathers " + feathers + " and lied eggs " + liedEggs);
    }
}
