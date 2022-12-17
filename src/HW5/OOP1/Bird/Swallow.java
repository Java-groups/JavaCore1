package HW5.OOP1.Bird;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, String layEggs, String flyingBird) {
        super(feathers, layEggs, flyingBird);
    }

    @Override
    public String toString() {
        return "Swallow [ " + super.toString() + " ]";
    }

    void print() {
        System.out.println(this);
    }
}
