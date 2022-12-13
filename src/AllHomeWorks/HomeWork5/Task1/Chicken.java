package AllHomeWorks.HomeWork5.Task1;

public class Chicken extends NonFlyingBird {
    protected  String type;

    public Chicken(String layEggs, String feathers, String type) {
        super(layEggs, feathers);
        this.type = type;
    }

    public void fly(){
        System.out.println("Chicken " +type +" is not flying");
    }
}
