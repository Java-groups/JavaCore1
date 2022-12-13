package HW5.Task1;

public class Eagle extends FlyingBird{

    public Eagle() {};
    public Eagle(String feathers, String layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);
    };

    @Override
    public String toString() {
        return "Eagle {" +
                "fathers='" + getFeathers() + '\'' +
                ", layEggs='" + getLayEggs() + '\'' +
                '}';
    }


}

