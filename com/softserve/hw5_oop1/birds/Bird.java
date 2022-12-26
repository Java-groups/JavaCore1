package com.softserve.hw5_oop1.birds;

public abstract class Bird {

    protected int feathers;

    protected int liedEggs;

    public Bird(int feathers, int liedEggs) {
        this.feathers = feathers;
        this.liedEggs = liedEggs;
    }

    public abstract void fly();

}
