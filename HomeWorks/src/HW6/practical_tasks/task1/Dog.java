package HW6.practical_tasks.task1;

public class Dog implements Animal {
	private String name;
	private String owner;
	
	public Dog(String name, String owner) {
		this.name = name;
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String voice() {
		return String.format("is barking!");
	}

	@Override
	public String feed() {
		return String.format("needs to be fed!");
	}

}
