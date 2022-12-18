package arthurmkrtchian.javaCore.OOP1.homeWorks.homeWork1;

public class FlyingBird extends Bird{

    public FlyingBird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public void fly() {
        System.out.println("uwiiiiiiiiiw..., I am flying....");
    }
}
