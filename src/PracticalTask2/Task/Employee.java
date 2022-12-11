package PracticalTask2.Task;

public class Employee {

    private String name;
    private double rate;
    private double hours;

    public static int totalSum;



    public Employee () {

    }

    public Employee (String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee (int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
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


    public double getSalary(){
        return rate * hours;
    }

    public double getBonuses(){
        return rate * hours*0.1;
    }

    @Override
    public String toString() {
        return "Employee [name="+name+", rate="+rate+" ,hours= "+hours+"]";
    }
}
