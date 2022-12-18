package HW6.Task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxWeight;

    public Helicopter(int passengers) {
        super(passengers);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "weight = " + weight +
                ", maxWeight = " + maxWeight + ", passengers = " + getPassengers() +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
