import java.util.List;
import java.util.ListIterator;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    static void printStudents(List students, Integer course) {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student element = iterator.next();
            if (element.getCourse() == course) {
                System.out.println(element.getName());
            }
        }
    }

    @Override
    public int compareTo(Student o) {
        return this.getCourse() - o.getCourse();
    }

    @Override
    public String toString() {
        return "Student " + name + ", course " + course;
    }
}
