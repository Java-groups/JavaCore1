package hw5.task1;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Penguins don't fly :( ");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
