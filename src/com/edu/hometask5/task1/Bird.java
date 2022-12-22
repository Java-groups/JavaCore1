package com.edu.hometask5.task1;

public abstract class Bird {
   private String feathers = "Has feather";
   private String layEggs = "Lay egs";

    public String getFeathers() {
        return feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public Bird() {
    }

    abstract String fly();
}

