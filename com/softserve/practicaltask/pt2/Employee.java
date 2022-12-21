package com.softserve.practicaltask.pt2;

public class Employee {

    public static void main(String[] args) {

        Employee empl1 = new Employee();
        empl1.setName("Pavlo");
        empl1.setRate(50);
        empl1.setHours(160);

        Employee empl2 = new Employee("Mykola");
        empl2.setRate(60);
        empl2.setHours(168);

        Employee empl3 = new Employee("Andrii", 80, 176);

        totalSum = empl1.getSalary() + empl1.getBonuses() + empl2.getSalary() + empl2.getBonuses() + empl3.getSalary() + empl3.getBonuses();
        System.out.println(empl1.toString() + empl2.toString() + empl3.toString());
        System.out.println("Total salary of all workers " + empl1.getName() + ", " + empl2.getName() + " and " + empl3.getName() + ", " + "with bonuses is: " + totalSum + "uah");

    }

    private String name;
    private double rate;
    private double hours;
    public static double totalSum;
    private double salary;
    private double bonuses;

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
        salary = rate*hours;
        return this.salary;
    }

    public double getBonuses() {
        bonuses = salary*0.1;
        return this.bonuses;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name = " + name  +
                ", rate = " + rate +
                ", hours = " + hours + '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
