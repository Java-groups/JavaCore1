package HW5.Task2;

public class Developer extends Employee{
    private String position;

    public Developer(String name, int age,String position, double salary) {
        super(name, age, salary);

        setPosition(position);

    }

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: " + getName() + ", Age: " + getAge() + ", Position: " + getPosition() + ", Salary: " + getSalary());
    }

}
