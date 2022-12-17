package HW5.OOP1.Bird;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, String layEggs, String nonFlying) {
        super(feathers, layEggs, nonFlying);
    }

    @Override
    public String toString() {
        return "Penguin [ " + super.toString() + " ]";
    }

    void print() {
        System.out.println(this);
    }
}
