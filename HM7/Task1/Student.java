package HM7.Task1;

public class Student extends Person implements Cloneable{
    int courseId;

    public Student(FullName fullName, int age, int courseId) {
        super(fullName, age);
        this.courseId = courseId;
    }

    @Override
    String activity() {
        return "I study at university";
    }

    @Override
    String info() {
        return super.info() + ", Course ID: " + courseId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
