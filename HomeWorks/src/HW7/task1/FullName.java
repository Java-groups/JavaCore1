package HW7.task1;

public class FullName implements Cloneable {
	private String firstName;
	private String lastName;

	public FullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
    @Override
    protected Object clone() {
        try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		return null;
    }

}
