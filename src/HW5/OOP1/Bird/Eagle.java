package HW5.OOP1.Bird;

public class Eagle extends FlyingBird {
    public Eagle(String feathers, String layEggs, String flyingBird) {
        super(feathers, layEggs, flyingBird);
    }

    @Override
    public String toString() {
        return "Eagle [ " + super.toString() + " ]";
    }

    void print() {
        System.out.println(this);
    }
}
