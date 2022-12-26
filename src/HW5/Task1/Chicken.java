package HW5.Task1;

public class Chicken extends NonFlyingBird{
	
public Chicken() {}
	
	public Chicken (String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("The chicken can't fly");
    }
	@Override
	public String toString() {
		return "Chicken feathers - " + getFeathers() + ", lay Eggs - " + getLayEggs();
	}

}
