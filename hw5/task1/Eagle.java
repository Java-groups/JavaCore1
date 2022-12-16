package hw5.task1;

public class Eagle extends FlyingBird {
    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Eagle flies when hunting");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
