package HM7.PracticalTask2;

public class Cleaner extends Staff{
    static final String TYPE_PERSON = "cleaner";

    Cleaner(String name) {
        super(name);
    }

    @Override
    String print() {
        return "My name is " + name + ". I am a " + TYPE_PERSON;
    }

    @Override
    String salary() {
        return "My salary is $300.00";
    }
}
