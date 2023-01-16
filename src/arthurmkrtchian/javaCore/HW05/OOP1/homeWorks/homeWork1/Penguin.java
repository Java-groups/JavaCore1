package arthurmkrtchian.javaCore.HW05.OOP1.homeWorks.homeWork1;

public class Penguin extends NonFlyingBird{

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("Penguin: ");
        super.fly();
    }
}
