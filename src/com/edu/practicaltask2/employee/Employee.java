package com.edu.practicaltask2.employee;

public class Employee {

    private String name;
    private double rate;
    private double hours;
    static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonus() {
        return getSalary() * 0.1;
    }

    public double getTotalSum() {
        return totalSum = getSalary() + getBonus();
    }

    @Override
    public String toString() {
        return "Employee (" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ')';
    }
}
