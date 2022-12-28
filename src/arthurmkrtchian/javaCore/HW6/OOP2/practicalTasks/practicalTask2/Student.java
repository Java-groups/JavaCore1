package arthurmkrtchian.javaCore.HW6.OOP2.practicalTasks.practicalTask2;

public class Student extends Person{

    private final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("Hi, I am a student!");
    }
}
