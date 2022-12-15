package HW6.PracticalTasks.Task2;

public class Teacher extends Staff{
    final String TYPE_PERSON = "Teacher";
    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }

    @Override
    public double salary() {
        return 2500;
    }

    public String typeOfPerson() {
        return TYPE_PERSON;
    }
}
