package AllHomeWorks.HomeWork6Practical.Task2;

public class Teacher extends Staff{

    final String TYPE_PERSON = "Teacher";
    public int salaryChange = 100;

    @Override
    public int salary(int salary) {
        salaryChange = salary+20;
        return (salaryChange);
    }

    public Teacher(String name) {
        super(name);
    }

    public void print(){
        System.out.println("I am a " +TYPE_PERSON + "."
        + "Salary: " + salary(salaryChange));
    }
}
