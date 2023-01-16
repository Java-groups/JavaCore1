package arthurmkrtchian.javaCore.HW05.OOP1.homeWorks.homeWork1;

public class Chiken extends NonFlyingBird{

    public Chiken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Chiken: I know that I am looks like an eagle but I cat`t fly as far as eagle can. I am working on it...");
    }
}
