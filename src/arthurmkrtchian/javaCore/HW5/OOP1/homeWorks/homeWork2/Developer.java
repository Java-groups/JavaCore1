package arthurmkrtchian.javaCore.HW5.OOP1.homeWorks.homeWork2;

public class Developer extends Employee{
    private String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20b4%.2f.",
                getName(),
                getAge(),
                position,
                getSalary());
    }

}
