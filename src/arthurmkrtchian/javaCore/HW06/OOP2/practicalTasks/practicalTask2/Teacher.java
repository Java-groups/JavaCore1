package arthurmkrtchian.javaCore.HW06.OOP2.practicalTasks.practicalTask2;

public class Teacher extends Staff {

    private final String TYPE_PERSON = "Teacher";

    public Teacher() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public double salary() {
        return 100;
    }

    @Override
    public void print() {
        System.out.println("Hi, I am a teacher!");
    }
}
