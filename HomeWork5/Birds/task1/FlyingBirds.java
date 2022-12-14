package edu.homeworks.hw5.task1;

public class FlyingBirds extends Birds {
    public FlyingBirds(String feather, String layEgg) {
        super(feather,layEgg);
    }


    @Override
    public String getLayEgg() {
        return layEgg;
    }


    @Override
    public String getFeather() {
        return feather;
    }

    @Override
    public String Fly(){
        return "This bird can fly!";
    }
}
