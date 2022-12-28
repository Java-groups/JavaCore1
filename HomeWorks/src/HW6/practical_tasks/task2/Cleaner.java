package HW6.practical_tasks.task2;

public class Cleaner extends Staff {
	final String PROFESSION = "cleaner";

	public Cleaner(String name) {
		super(name);
	}

	@Override
	void print() {
		System.out.println(("I am a " + PROFESSION + ", my name is " + name + ", my salary is " + salary() + " \u20B4"));
	}

	@Override
	public double salary() {
		return 13000;
	}

}
