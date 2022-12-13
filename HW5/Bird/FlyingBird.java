import static java.lang.System.out;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String getFeathers() {
        return feathers;
    }

    @Override
    public String getLayEggs() {
        return layEggs;
    }

    @Override
    public void fly() {
        out.print("This bird can fly.");
    }
}

