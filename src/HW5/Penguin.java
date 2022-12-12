package HW5;

public class Penguin extends NonFlyingBird{

    public Penguin() {};
    public Penguin(String feathers, String layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    @Override
    public String toString() {
        return "Penguin {" +
                "fathers='" + getFeathers() + '\'' +
                ", layEggs='" + getLayEggs() + '\'' +
                '}';
    }

}
