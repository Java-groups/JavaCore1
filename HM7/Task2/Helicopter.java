package HM7.Task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    Helicopter(int passengers) {
        super(passengers);
    }

    @Override
    void fly() {}

    @Override
    void land() {}
}
