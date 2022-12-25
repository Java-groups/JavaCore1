package HM6.PracticalTask2;

public class Student extends Person{
    static final String TYPE_PERSON = "student";

    Student(String name) {
        super(name);
    }

    @Override
    String print() {
        return "My name is " + name + ". I am a " + TYPE_PERSON;
    }
}
