package HW5.Task1;

public class Swallow extends FlyingBird{
	
	public Swallow() {
	}

	
	public Swallow (String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public void fly() {
		System.out.println("The swallow can fly");
    }

	@Override
	public String toString() {
		return "Swallow feathers - " + getFeathers() + ", lay Eggs - " + getLayEggs();
	}
}
