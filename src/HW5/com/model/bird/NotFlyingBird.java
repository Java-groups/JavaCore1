package HW5.com.model.bird;

public class NotFlyingBird extends Bird {

    public NotFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "NotFlyingBird{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs='" + getLayEggs() + '\'' +
                '}';
    }

    @Override
     public void fly() {
        System.out.println(" This Bird can`t fly!");
    }
}
