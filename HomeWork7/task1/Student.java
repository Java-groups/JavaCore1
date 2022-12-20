package edu.homeworks.hw7.task1;

public class Student extends Person implements Cloneable{
    protected int course;


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(FullName fullName,int age,int course){
        super(fullName,age);
        this.course = course;
    }
    @Override
     public String info(){
        return "First name:" + fullName.getLastName() +
                "\n Last name: " + fullName.getLastName() +
                "\n Age: " + age +
                "\n Course: " + this.course;
    }

    @Override
    String activity() {
        return "I study in university";
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student copyStud = (Student) super.clone();
        return copyStud;
    }
}
