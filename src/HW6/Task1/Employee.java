package HW6.Task1;

import java.util.Comparator;

abstract public class Employee {
    private String employeeld;
    private double salary;
//    static SalaryComparator salaryComparator = new SalaryComparator();
//    public static Comparator getSalaryComparator() {
//        return salaryComparator;
//    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }
//    static class SalaryComparator implements Comparator<Employee> {
//        @Override
//        public int compare(Employee o1, Employee o2) {
//            return (int) (o1.getSalary() - o2.getSalary());
//        }
//
//    }
}
