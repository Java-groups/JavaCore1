package PracticalTasks.Task2;

public class Cleaner extends Staff{
    final String TYPE_PERSON = "Cleaner";

    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }

    @Override
    public double salary() {
        return 2000;
    }

    public String typeOfPerson() {
        return TYPE_PERSON;
    }
}
