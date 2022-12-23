package HW4.practical_tasks;

import java.util.Comparator;

public class EmployeeComparator  implements Comparator <Employee> {

	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) {
		return Integer.compare(firstEmployee.getSalary(), secondEmployee.getSalary());
	}

}
