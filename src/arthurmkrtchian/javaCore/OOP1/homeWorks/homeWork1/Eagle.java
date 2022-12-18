package arthurmkrtchian.javaCore.OOP1.homeWorks.homeWork1;

public class Eagle extends FlyingBird{

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle: I am flying...");;
    }
}
