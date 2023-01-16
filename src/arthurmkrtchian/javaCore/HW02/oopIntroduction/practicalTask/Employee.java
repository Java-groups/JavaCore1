package arthurmkrtchian.javaCore.HW02.oopIntroduction.practicalTask;


//      Create class Employee which should consist of
//        • three private fields: name, rate and hours;
//        • static field totalSum
//        • properties for access to these fields;
//        • default constructor and two constructors with parameters;
//        • methods:
//        • getSalary() - to calculate the salary of person (rate * hours)
//        • toString() - to output information about employee
//        • getBonuses() – to calculate 10% from salary
//        • In the method main() create 3 objects of Employee type.
//        • Input information about them.
//        • Display the total salary of all workers to screen



public class Employee {

    static double totalSum;
    private String name;
    private double rate;
    private double hours;

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + getSalary() + getBonuses();
    }

    public Employee(double rate, double hours) {
        this.name = "unknown";
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + getSalary() + getBonuses();
    }

    public Employee() {
        this.name = "unknown";
        this.rate = 0;
        this.hours = 0;
        totalSum = totalSum + getSalary() + getBonuses();
    }

    public double getSalary(){
        return rate*hours;
    }

    public double getBonuses(){
        return getSalary()/10;
    }

    @Override
    public String toString(){
        return  "Name: " + name +
                "\nRate: " + rate +
                "\nHours: " + hours +
                "\nSalary: " + getSalary() +
                "\nBonuses: " + getBonuses();
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
