package hw5.task1;

public abstract class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public abstract void fly();

}
