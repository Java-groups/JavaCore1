package HW5.Task1;

public abstract class FlyingBird extends Bird{
	

	
	public FlyingBird() {
		super();
	}
	
	
	public FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	
	@Override
	public void fly() {

		System.out.println ("This bird can fly");

	}

}
