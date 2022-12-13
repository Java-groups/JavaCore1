package AllHomeWorks.HomeWork5.Task1;

public class Eagle extends FlyingBird{

    protected  String type;
    public Eagle(String layEggs, String feathers, String type) {
        super(layEggs, feathers);
        this.type = type;
    }

    public void fly(){
        System.out.println("Eagle " +type +" is flying");
    }
}
