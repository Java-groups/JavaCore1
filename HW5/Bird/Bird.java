public abstract class Bird {
    protected String feathers;
    protected String layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract public String getFeathers();

    abstract public String getLayEggs();

    abstract public void fly();
}