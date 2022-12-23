package HW4.practical_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Employee {
	
	private static String[] departments = {"Lviv", "Ternopil", "Kyiv"};
	
    private String name;
	private int departmentNumber;
	private int salary;
	
	public Employee() {}
	
	public Employee(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	
	public String getName() {
		return name; }
	
	public Integer getDepartmentNumber() {
		return departmentNumber; }
	
	public Integer getSalary() {
		return salary; }
	
	public void setName(String name) {
		this.name = name; }
	
	public void setDepartmentNumber(Integer departmentNumber) {
		this.departmentNumber = departmentNumber; }
	
	public void setSalary(Integer salary) {
		this.salary = salary; }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Employee> employees = new ArrayList<>();
		    employees.add (new Employee("Nazar_Klimovych", 0, 23000));
		    employees.add (new Employee("Yaryna_Semenchuk", 1, 27000));
		    employees.add (new Employee("Oleg_Vyshnevsky", 0, 17000));
		    employees.add (new Employee("Angelina_Udovychenko", 2, 16500));
		    employees.add (new Employee("Vasyl_Glyva", 1, 37000));
		
		
		System.out.print("Enter the department number:\n"
				+ "'Lviv - 0'\n"
				+ "'Ternopil - 1'\n"
				+ "'Kiyv - 2'\n");
		
        int departmentNumber = Integer.parseInt(br.readLine());
        
        getSortByDepartment(employees, departmentNumber);
        getSortBySalary(employees);
	}
		
	public static List<Employee> getSortByDepartment(List<Employee> employee, Integer departmentNumber) {
    	List<Employee> bySalary = new ArrayList<>();
    	for (int i = 0; i < employee.size(); i++) {
    		if (employee.get(i).getDepartmentNumber() == departmentNumber) {
    			bySalary.add(employee.get(i));
    			System.out.println(employee.get(i));
    		}
    	} return bySalary;
		
    }
	
	public static List<Employee> getSortBySalary(List<Employee> employee) {
		Collections.sort(employee, new EmployeeComparator());
        return employee;
        }

	@Override
	public String toString() { 
	    return "\n\nEmpolyee: '" + name + "', \nDepartment: '" + departments[departmentNumber] + "', \nSalary: '" + salary + "'";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentNumber, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return departmentNumber == other.departmentNumber && Objects.equals(name, other.name) && salary == other.salary;
	} 
	
}
