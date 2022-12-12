package HW5;

public class Chicken extends NonFlyingBird{

    public Chicken() {};
    public Chicken(String feathers, String layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    @Override
    public String toString() {
        return "Chicken {" +
                "fathers='" + getFeathers() + '\'' +
                ", layEggs='" + getLayEggs() + '\'' +
                '}';
    }
}
