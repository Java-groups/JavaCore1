package HW5.OOP1.Bird;

// Develop abstract class Bird with attributes
//feathers and layEggs and an abstarct method
//fly().
//Develop classes FlyingBird and NonFlyingBird.
//Create class Eagle, Swallow, Penguin and
//Chicken.
//Create array Bird and add different birds to
//it.
//Call fly() method for all of it. Output the
//information about each type of created bird.

abstract public class Bird {
    private String feathers;
    private String layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "feathers = '" + feathers + '\'' +
                ", layEggs = '" + layEggs + '\'' +
                ",";
    }

    abstract String fly();
}
