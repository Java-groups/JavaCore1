package AllHomeWorks.HomeWork5.Task2;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee (String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String report(){
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.", this.getName(), this.getAge(), this.getSalary());
    }
}
