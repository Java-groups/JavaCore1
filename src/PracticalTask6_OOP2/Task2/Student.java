package PracticalTask6_OOP2.Task2;

public class Student extends Person {
    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am " + TYPE_PERSON + ". My name is " + getName() + ".");
    }
}
