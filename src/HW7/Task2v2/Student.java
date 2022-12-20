package HW7.Task2v2;



public class Student extends Person implements Cloneable{
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String firstName,String lastName, int age, int course) {
        super(firstName,lastName, age);
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return ("Student: " + super.info() + ", Course " + getCourse());
    }
}
