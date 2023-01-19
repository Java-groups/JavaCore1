package HW13.task2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("Nazar"));
		employee.add(new Employee("vasyl"));
		employee.add(new Employee("Ostap"));
		employee.add(new Employee("vasyL"));
		employee.add(new Employee("AnDrij"));
		employee.add(new Employee("vasYl"));
		employee.add(new Employee("naZar"));


		List<Employee> employee1 = new ArrayList<>();

		System.out.print("List is not empty: ");
		System.out.println(Employee.mostPopularName(employee.stream()).orElse(null));

		System.out.print("\nList is empty: ");
		System.out.println(Employee.mostPopularName(employee1.stream()).orElse(null));
	}
}
