package HW7.com.model;

import HW7.com.Person;

public class Student extends Person implements Cloneable{
    private int course;

    public Student() {
    }

    public Student(FullName fullName, int age) {
        super(fullName, age);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String activity() {
        return ("I am studying");
    }

    @Override
    public void info() {
        System.out.println("First name: " + fullName.getFirstName() + " LastName: " + fullName.getLastName() + " Age: " + getAge() + " Course " + getCourse());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        return copyOfStudent;
    }
}
