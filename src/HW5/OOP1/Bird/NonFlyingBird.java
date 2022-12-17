package HW5.OOP1.Bird;

public class NonFlyingBird extends Bird {
    private String nonFlying;

    public NonFlyingBird(String feathers, String layEggs, String nonFlying) {
        super(feathers, layEggs);
        this.nonFlying = nonFlying;
    }

    @Override
    public String toString() {
        return super.toString() +
                " nonFlying = '" + nonFlying + '\'';
    }

    @Override
    String fly() {
        System.out.println("type feathers " + getClass().getSimpleName() + " : " + this.getFeathers());
        return this.getFeathers();
    }
}
