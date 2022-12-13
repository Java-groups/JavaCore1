package AllHomeWorks.HomeWork5.Task1;

public class NonFlyingBird extends  Bird{

    public NonFlyingBird(String layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public void fly() {
        System.out.println("The bird is no flying");
    }
}
