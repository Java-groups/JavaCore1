package Lesson7.practical2;

public class Teacher extends Staff{
    private static final String TYPE_PERSON = "teacher";
    public Teacher(){
        System.out.println("Created " + TYPE_PERSON);
    }
    @Override
    public void print() {
        System.out.println("I am a teacher");
    }
    @Override
    public int salary() {
        return 5000;
    }
}
