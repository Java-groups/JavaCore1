package HW5.OOP1.Bird;

public class Chicken extends NonFlyingBird {
    public Chicken(String feathers, String layEggs, String nonFlying) {
        super(feathers, layEggs, nonFlying);
    }

    @Override
    public String toString() {
        return "Chicken [ " + super.toString() + " ]";
    }

    void print() {
        System.out.println(this);
    }
}
