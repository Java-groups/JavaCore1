package HW7.Task2;

public class Student extends Person implements Cloneable{
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(FullName fullName, int age) {
        super(fullName, age);
    }


    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return ("Student: " + super.info() + ", Course " + getCourse());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
