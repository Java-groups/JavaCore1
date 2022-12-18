package HM5.HomeWorkTask1;

abstract class Bird {
    String feathers, layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this. layEggs = layEggs;
    }

    abstract String fly();

    @Override
    public String toString() {
        return "I have " + feathers + " feathers and I lay " + layEggs;
    }
}
