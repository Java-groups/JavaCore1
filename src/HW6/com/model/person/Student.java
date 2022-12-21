package HW6.com.model.person;

public class Student extends Person {
    public final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " +getName());
    }

    @Override
    public void print() {
        System.out.println("I am student");
    }
}
