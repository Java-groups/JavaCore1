import static java.lang.System.out;

public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        out.print(" It is a penguin. ");
    }
}
