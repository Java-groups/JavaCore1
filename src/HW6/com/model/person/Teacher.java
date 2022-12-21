package HW6.com.model.person;

public class Teacher extends Stuff {
    public final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " + getName());
    }

    @Override
    public void print() {
        System.out.println("I am teacher");
    }

    @Override
    public void salary() {
        System.out.println("My salary is 1000");
    }
}
