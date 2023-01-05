package HW9.practical_tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) {
		Map<Integer, String> employeeMap = new HashMap<>();
		Employee emp = new Employee();
		
//    Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the
//	  screen
		employeeMap = emp.addEmployee();
		System.out.println("\n=============== EMPLOYEE MAP ===============\n");
		emp.print(employeeMap);
		
//	  Ask user to enter ID, then find and write corresponding name from your map. If you
//	  can't find this ID - say about it to user (use function containsKey())
		System.out.println("\n=========== FIND EMPLOYEE BY ID ============\n");
		emp.findEmployeeById(employeeMap);
		
//    Ask user to enter name, verify than you have name in your map and write corresponding
//	  ID. If you can't find this name - say about it to user  (use function containsValue())
		System.out.println("\n========= FIND EMPLOYEE BY VALUE ===========\n");
        emp.findEmployeeByValue(employeeMap);
	}
}
