package HW5.com.model.bird;

public class Swallow extends FlyingBird {


    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public String toString(){
        return ("Swallow" + super.toString());
    }


    @Override
     public void fly() {
        System.out.println("It is swallow");
    }
}
