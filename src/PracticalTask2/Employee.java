package PracticalTask2;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    public static double totalSum = 0;

    // default constructor and two constructors with parameters;
    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
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

    // getSalary() - to calculate the salary of person (rate * hours)
    public double getSalary(double price, double time) {
        totalSum += price * time;
        return price * time;
    }

    // toString() - to output information about employee
    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    // getBonuses() – to calculate 10% from salary
    public double getBonuses(double salary) {
        return salary * 0.1;
    }

}
