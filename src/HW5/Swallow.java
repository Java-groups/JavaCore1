package HW5;

public class Swallow extends FlyingBird{

    public Swallow() {};
    public Swallow(String feathers, String layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    @Override
    public String toString() {
        return "Swallow {" +
                "fathers='" + getFeathers() + '\'' +
                ", layEggs='" + getLayEggs() + '\'' +
                '}';
    }

}
