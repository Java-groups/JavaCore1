package HW5.OOP1.Bird;

public class FlyingBird extends Bird {
    private String flyingBird;

    public FlyingBird(String feathers, String layEggs, String flyingBird) {
        super(feathers, layEggs);
        this.flyingBird = flyingBird;
    }

    @Override
    public String toString() {
        return super.toString() +
                " flyingBird = '" + flyingBird + '\'';
    }

    @Override
    String fly() {
        System.out.println("qty egg " + getClass().getSimpleName() + " : " + this.getLayEggs() + " pieces");
        return this.getLayEggs();
    }
}
