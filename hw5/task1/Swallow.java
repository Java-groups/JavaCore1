package hw5.task1;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Swallow flies low");
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
