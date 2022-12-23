package Test.HW4.practical_tasks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import HW4.practical_tasks.Employee;

class TestEmployee {

	@Test
	void testSortByDepartment() {
		List<Employee> employees = new ArrayList<>();
	        employees.add (new Employee("Nazar_Klimovych", 0, 23000));
	        employees.add (new Employee("Yaryna_Semenchuk", 1, 27000));
	        employees.add (new Employee("Oleg_Vyshnevsky", 0, 17000));
    	    employees.add (new Employee("Angelina_Udovychenko", 2, 16500));
	        employees.add (new Employee("Vasyl_Glyva", 1, 37000));
	        
		List<Employee> actual = Employee.getSortByDepartment(employees, 1);
		List<Employee> expected = new ArrayList<>();
		    expected.add (new Employee("Yaryna_Semenchuk", 1, 27000));
		    expected.add (new Employee("Vasyl_Glyva", 1, 37000));
		    for (int i = 0; i < expected.size(); i++) {
		    	assertEquals(expected.get(i), actual.get(i));
		    }
	}
	
	@Test
	void testSortBySalary() {
		List<Employee> employees = new ArrayList<>();
        employees.add (new Employee("Nazar_Klimovych", 0, 23000));
        employees.add (new Employee("Yaryna_Semenchuk", 1, 27000));
        employees.add (new Employee("Oleg_Vyshnevsky", 0, 17000));
	    employees.add (new Employee("Angelina_Udovychenko", 2, 16500));
        employees.add (new Employee("Vasyl_Glyva", 1, 37000));
	
    		List<Employee> actual = Employee.getSortBySalary(employees);
    		
    		List<Employee> expected = new ArrayList<>();
    		    expected.add (new Employee("Angelina_Udovychenko", 2, 16500));
    		    expected.add (new Employee("Oleg_Vyshnevsky", 0, 17000));
    		    expected.add (new Employee("Nazar_Klimovych", 0, 23000));
    		    expected.add (new Employee("Yaryna_Semenchuk", 1, 27000));
    		    expected.add (new Employee("Vasyl_Glyva", 1, 37000));

    		    for (int i = 0; i < expected.size(); i++) {
    		    	assertEquals(expected.get(i), actual.get(i));
    		    }

	}

}
