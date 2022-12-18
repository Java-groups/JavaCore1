package PracticalTask6_OOP2.Task2;

public class Teachers extends Staff {

    private static final String TYPE_PERSON = "Teacher";

    public Teachers(String name) {
        super(name);
    }

    @Override
    double salary() {
        return 2000;
    }
}
