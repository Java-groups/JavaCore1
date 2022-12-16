package hw5.task1;

public abstract class FlyingBird extends Bird {
    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public abstract void fly();
}
