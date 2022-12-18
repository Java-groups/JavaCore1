package HM5.HomeWorkTask1;

public class NonFlyingBird extends Bird{
    String fly() {
        return "I can't fly";
    }
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
}

class Penguin extends NonFlyingBird {
    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
}

class Chicken extends NonFlyingBird {
    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
}