package HW5.Task1;

public class  Penguin extends NonFlyingBird{
		
	public Penguin() {}
	
	public Penguin (String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("The Penguin can't fly");

    }
	@Override
	public String toString() {

		return "Penguin feathers - " + getFeathers() + ", lay Eggs - " + getLayEggs();
	}

}
