package Test.HW4.practical_tasks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import HW4.practical_tasks.Employee;
import HW4.practical_tasks.EmployeeComparator;

class TestEmployeeComparator {

	@Test
	void testCompare() {
		List<Employee> employees = new ArrayList<>();
	        employees.add (new Employee("Vasyl_Glyva", 1, 27000));
	        employees.add (new Employee("Oleg_Vyshnevsky", 0, 21000));
	        
        List<Employee> expected = new ArrayList<>(); 
            expected.add (new Employee("Oleg_Vyshnevsky", 0, 21000));
            expected.add (new Employee("Vasyl_Glyva", 1, 27000));
            
        Collections.sort(employees, new EmployeeComparator());
        
	    assertEquals(expected, employees);
	}

}
