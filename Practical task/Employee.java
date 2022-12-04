public class Employee {
    private String name;
    private double rate;
    private double hours;

    public static double totalSum = 0;

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






    public Employee(){}
    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary(){
        return this.hours*this.rate;

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getBonuses(){

        return hours*rate*0.1;
    }



}
