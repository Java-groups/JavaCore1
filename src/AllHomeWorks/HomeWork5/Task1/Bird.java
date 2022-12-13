package AllHomeWorks.HomeWork5.Task1;

public abstract class Bird {
    protected String layEggs;
    protected String feathers;

    abstract public void fly();

    public Bird (String layEggs, String feathers){
        this.layEggs = layEggs;
        this.feathers = feathers;
    }
}
