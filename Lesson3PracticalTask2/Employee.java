public class Employee {
    //Fields
    private String name;
    private int rate, hours;
    static int totalSum;

    //Properties for access to the fields

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //Constructors
    public Employee () {}

    public Employee (String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee (int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    //Methods
    public int getSalary() {
        return rate*hours;
    }

    @Override
    public String toString() {
        return "Employee name = " + name + " rate = " + rate + " hours = " + hours;
    }

    public double getBonuses () {
        return rate*hours*0.1;
    }

    //Method main
    public static void main(String[] args) {
        Employee Employee1 = new Employee();
        Employee1.setName("Roman");
        Employee1.setHours(176);
        Employee1.setRate(35);

        Employee Employee2 = new Employee();
        Employee2.setName("Ira");
        Employee2.setHours(160);
        Employee2.setRate(45);

        Employee Employee3 = new Employee();
        Employee3.setName("Oleg");
        Employee3.setHours(164);
        Employee3.setRate(40);

        totalSum = Employee1.getSalary() + Employee2.getSalary() + Employee3.getSalary();
        System.out.println("The total salary of all workers is " + totalSum + " USD");
    }
}
