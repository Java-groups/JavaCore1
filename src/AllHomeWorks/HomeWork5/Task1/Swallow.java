package AllHomeWorks.HomeWork5.Task1;

public class Swallow extends FlyingBird{
    protected String type;

    public Swallow(String layEggs, String feathers, String type) {
        super(layEggs, feathers);
        this.type = type;
    }

    public void fly(){
        System.out.println("Swallow " +type +" is flying");
    }
}
