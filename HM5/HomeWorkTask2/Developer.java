package HM5.HomeWorkTask2;

public class Developer extends Employee{
    private String position;
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return name + ", Age: " + age + " years, Position: " + position + ", Salary: " + salary;
    }
}
