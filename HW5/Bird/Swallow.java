import static java.lang.System.out;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        out.print(" It is a swallow. ");
    }
}
