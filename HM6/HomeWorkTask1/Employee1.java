package HM6.HomeWorkTask1;

public class Employee1 implements Payment, Comparable{

    String employeeId;
    String name;

    public Employee1(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Employee ID: " + employeeId;
    }

    @Override
    public int calculatePay() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        int compareSalary = ((Employee1) o).calculatePay();
        return this.calculatePay() - compareSalary;
    }
}
