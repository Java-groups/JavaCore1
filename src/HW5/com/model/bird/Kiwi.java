package HW5.com.model.bird;

public class Kiwi extends NotFlyingBird {


    public Kiwi(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public String toString(){
        return ("Kiwi " + super.toString());
    }


    @Override
     public void fly() {
        System.out.println("It is kiwi");
    }
}
