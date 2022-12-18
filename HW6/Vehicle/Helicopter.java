import static java.lang.System.out;

public class Helicopter extends FlyingVehicle {
    private int maxHeight;
    private int weight;

    public Helicopter(int passengers, int maxHeight, int weight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        out.println("The helicopter is taking off");
    }

    @Override
    public void land() {
        out.println("The helicopter is landing");

    }
}
