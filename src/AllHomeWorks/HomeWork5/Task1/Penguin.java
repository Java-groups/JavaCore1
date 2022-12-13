package AllHomeWorks.HomeWork5.Task1;

public class Penguin extends NonFlyingBird{
    protected String type;

    public Penguin (String layEggs, String feathers, String type) {
        super(layEggs, feathers);
        this.type = type;
    }

    public void fly(){
        System.out.println("Eagle " +type +" is not flying");
    }
}
