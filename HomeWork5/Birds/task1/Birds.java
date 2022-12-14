package edu.homeworks.hw5.task1;

abstract class Birds {
    protected String feather;
    protected String layEgg;

    public Birds(String feather,String layEgg){
        this.feather = feather;
        this.layEgg = layEgg;
    }

    public String getFeather() {
        return feather;
    }

    public void setFeather(String feather) {
        this.feather = feather;
    }

    public String getLayEgg() {
        return layEgg;
    }

    public void setLayEgg(String layEgg) {
        this.layEgg = layEgg;
    }

    public abstract String Fly();




}

