package PracticalTask6_OOP2.Task2;

public class Cleaners extends Staff {

    private static final String TYPE_PERSON = "Cleaner";

    public Cleaners(String name) {
        super(name);
    }

    @Override
    double salary() {
        return 1900;
    }
}
