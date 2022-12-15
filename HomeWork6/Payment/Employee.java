package edu.homeworks.hw6.Payment;

public class Employee implements Payment {
    protected int employeeID;
    protected String name;
    public int salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public void setName(int employeeID,String name,int salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name){
        this.name = name;
    };

    @Override
    public int calculatePay() {
        return 0;
    }



}
