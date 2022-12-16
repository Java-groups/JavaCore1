package hw5.task1;

public abstract class Bird {
    protected String feathers;
    protected int layEggs;

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    ;

    public abstract void fly();


}
