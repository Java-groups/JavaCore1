public class Employee {
    private String name;
    private double rate;
    private double hours;
    static double totalSum;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
        this.name = name;
    }

    public void dispatchAmountOfSalary() {
        totalSum += getSalary();
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "employee name: " + name
                + "\nrate: " + rate
                + "\namount of hours: " + hours;
    }
}
