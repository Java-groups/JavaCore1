package HW5.Task1;

public abstract class NonFlyingBird extends Bird{


	public NonFlyingBird() {
		super();
	}
	
	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public void fly() {
		System.out.println ("This bird can not fly");

    }

}
