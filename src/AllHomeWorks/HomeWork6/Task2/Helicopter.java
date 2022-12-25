package AllHomeWorks.HomeWork6.Task2;

public class Helicopter extends FlyingVehicle{
    public int weight;
    public int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight){
        super(passengers);
        setWeight(weight);
        setMaxHeight(maxHeight);
        fly();
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    void fly() {
        isFlying = getMaxHeight() > 0;
    }

    @Override
    void land() {
        isFlying = false;
    }

    public String toString() {
        return String.format("%s, weight: %d, max Height = %d:", super.toString(), getWeight(), getMaxHeight());
    }
}
