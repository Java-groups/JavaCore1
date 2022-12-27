package HW5.task2;

public class Developer extends Employee {
	private String position;

	public Developer(String name, int age, String position, double salary) {
		super(name, age, salary);
		this.position = position;
	}
	
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    @Override
    public String report() {
		return String.format("Name: " + getName() + ", Age: "+ getAge() + ", Position: " + getPosition() + ", Salary: " + getSalary() + " \u20B4");	
    }

}
