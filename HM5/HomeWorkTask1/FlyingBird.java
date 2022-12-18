package HM5.HomeWorkTask1;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    String fly() {
        return "I can fly";
    }
}

class Eagle extends FlyingBird {
    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
}

class Swallow extends FlyingBird {
    public Swallow (String feathers, String layEggs) {
        super(feathers, layEggs);
    }
}