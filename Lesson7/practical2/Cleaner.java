package Lesson7.practical2;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "cleaner";

    public Cleaner() {
        System.out.println("Created " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner");
    }

    @Override
    public int salary() {
        return 1500;
    }
}
