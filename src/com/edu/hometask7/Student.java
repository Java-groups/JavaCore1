package com.edu.hometask7;

public class Student extends Person implements Cloneable{

    private int course;

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(int age, FullName fullName, int course) {
        super(age, fullName);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        return copyOfStudent;

    }
}
