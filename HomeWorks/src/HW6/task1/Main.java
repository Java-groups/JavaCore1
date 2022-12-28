package HW6.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new SalariedEmployee("Java Developer", 37000, "CN-38904925"));
		employees.add(new SalariedEmployee("FrontEnd Developer", 47000, "CN-38904925"));
		employees.add(new ContractEmployee("Electricity worker", 55, 264, "TI-38904925"));
		employees.add(new ContractEmployee("Cleaner", 65, 220, "TI-38904925"));
		
		employees.forEach(employee -> System.out.println(employee.toString()));
	}

}
