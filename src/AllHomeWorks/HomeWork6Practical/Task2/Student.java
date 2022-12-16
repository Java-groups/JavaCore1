package AllHomeWorks.HomeWork6Practical.Task2;

public class Student extends Person{

    final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    public void print(){
        System.out.println("I am a " +TYPE_PERSON +".");
    }

}
