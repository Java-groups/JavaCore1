package HW6.com.model.person;

public class Cleaner extends Stuff {
    public final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " + getName());
    }

    @Override
    public void print() {
        System.out.println("I am cleaner");
    }

    @Override
    public void salary() {
        System.out.println("My salary is 500");
    }
}
