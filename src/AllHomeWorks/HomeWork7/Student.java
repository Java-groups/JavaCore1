package AllHomeWorks.HomeWork7;

public class Student extends Person implements Cloneable{
    public  int course;
    public Student(int course, FullName fullName, int age) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public String activity() {
        return "I study at university.";
    }

    @Override
    public String toString() {
        return String.format("\nNumber of course: %d, %s", getCourse(), super.toString());
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
