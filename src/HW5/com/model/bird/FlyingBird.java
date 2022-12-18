package HW5.com.model.bird;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs='" + getLayEggs() + '\'' +
                '}';
    }

    @Override
     public void fly() {
        System.out.println("Bird can fly!");
    }
}
