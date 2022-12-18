package HW5.com.model.bird;

public class Chicken extends NotFlyingBird {


    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public String toString(){
        return ("Chicken " + super.toString());
    }


    @Override
     public void fly() {
        System.out.println("It is chicken");
    }
}
