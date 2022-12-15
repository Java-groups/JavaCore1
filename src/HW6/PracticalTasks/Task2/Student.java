package HW6.PracticalTasks.Task2;

public class Student extends Person{
    final String TYPE_PERSON = "Student";
    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }

    public String typeOfPerson() {
        return TYPE_PERSON;
    }
}
