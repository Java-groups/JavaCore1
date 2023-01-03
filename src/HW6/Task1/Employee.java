package HW6.Task1;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private String name;

    private int employeeId;
    private int salary;


    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }
    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;

    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o .name);
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }




}
