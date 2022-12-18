package arthurmkrtchian.javaCore.OOP1.homeWorks.homeWork1;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public void fly() {
        System.out.println("Umm... Don`t even think about to help me. I can`t fly!!!");
    }
}
