package HW7.task1;

public abstract class Person implements Cloneable {
	private FullName fullName;
	private int age;
	
	public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String info() {
		return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
	}
	
	abstract public String activity();
    
    @Override
    protected Object clone() {
        Person copyOfPerson = null;
		try {
			copyOfPerson = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
        copyOfPerson.fullName = (FullName)copyOfPerson.fullName.clone();
        return copyOfPerson;
    }
}
