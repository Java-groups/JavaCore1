package hw5.task1;

public class Chicken extends NonFlyingBird {
    public Chicken(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Chickens can't fly, but they produce eggs");
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
