package HW7.practical_tasks;

import java.util.ArrayList;
import java.util.List;

public class Department implements Cloneable {
	private String name;
	private Address address;

	public Department(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Department() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Department: " + name + " - " + address;
	}

	@Override
	protected Object clone() {
		Department copyOfDepartment = null;
		try {
			copyOfDepartment = (Department) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}
		try {
			copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("\nOOPS! SOMETHING WENT WRONG!\n");
			e.printStackTrace();
		}

		return copyOfDepartment;
	}

	static class Address implements Cloneable {
		private String city;
		private String street;
		private int building;

		public Address(String city, String street, int building) {
			super();
			this.city = city;
			this.street = street;
			this.building = building;
		}

		public int getBuilding() {
			return building;
		}

		public void setBuilding(int building) {
			this.building = building;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		@Override
		public String toString() {
			return "Address: " + city + ", " + street + ", " + building;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

	}

	public static void main(String[] args) {
		List<Department> departments = new ArrayList<>();
		departments.add(new Department("SoftServe-2", new Department.Address("Lviv", "Pasternaka street", 5)));
		departments.add(new Department("SoftServe-8", new Department.Address("Lviv", "Naukova street", 7)));
		departments.add(new Department("SoftServe-5", new Department.Address("Lviv", "Smal-Stockoho street", 38)));

		Department copyOfDepartment = (Department) departments.get(departments.size() - 1).clone();
		copyOfDepartment.address.setCity("Rivne");
		departments.add(copyOfDepartment);

		departments.forEach(department -> System.out.println(department));

	}

}
