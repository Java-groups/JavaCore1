package HW5.Task1;

public class Eagle extends FlyingBird{
	
	public Eagle() {
	}
	
	public Eagle (String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("The eagle can fly");
    }
	@Override
	public String toString() {
		return "Eagle feathers - " + getFeathers() + ", lay Eggs - " + getLayEggs();
	}
}
