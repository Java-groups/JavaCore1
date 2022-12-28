package HW6.practical_tasks.task2;

public class Student extends Person {
	final String PROFESSION = "student";

	public Student(String name) {
		super(name);
	}

	@Override
	void print() {
		System.out.println(("I am a " + PROFESSION + ", my name is " + name + "."));
	}

}
