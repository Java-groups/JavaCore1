package HW7_innerClasses;

public class Student extends Person implements Cloneable {

    private int course;

    public Student(int age, FullName fullName, int course) {
        super(age, fullName);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return (super.info().concat(", Course: " + this.course));
    }

    @Override
    public String activity() {
        if (getClass().getSimpleName().equals("Student")) {
            return "I study at university";
        }
        return "i am not Student";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() +
                ", course = " + course +
                " ]";
    }
}
