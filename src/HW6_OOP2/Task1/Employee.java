package HW6_OOP2.Task1;

public class Employee implements Payment {
    private String employee;
    private double salary;

    public Employee(String employee) {
        this.employee = employee;
        this.salary = salary;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee='" + employee + '\'' +
                ", salary=" + salary +
                '}';
    }



    void print() {

    }

    @Override
    public void calculatePay() {

    }
}
