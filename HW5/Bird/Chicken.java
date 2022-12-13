import static java.lang.System.out;

public class Chicken extends NonFlyingBird {
    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        out.print(" It is a chicken. ");
    }
}
