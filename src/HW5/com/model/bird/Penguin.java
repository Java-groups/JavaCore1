package HW5.com.model.bird;

public class Penguin extends NotFlyingBird {


    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public String toString(){
        return ("Penguin" + super.toString());
    }


    @Override
     public void fly() {
        System.out.println("It is pengiun");
    }
}
