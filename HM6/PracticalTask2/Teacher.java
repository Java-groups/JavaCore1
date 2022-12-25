package HM6.PracticalTask2;

public class Teacher extends Staff{
    static final String TYPE_PERSON = "teacher";

    Teacher(String name) {
        super(name);
    }

    @Override
    String print() {
        return "My name is " + name + ". I am a " + TYPE_PERSON;
    }

    @Override
    String salary() {
        return "My salary is $2000.00";
    }
}
