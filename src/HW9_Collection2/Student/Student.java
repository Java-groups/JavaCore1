package HW9_Collection2.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student() {

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void printStudents(List<Student> students, Integer course) {
        System.out.println("\n Students leaning on " + course + " course: ");
        Iterator<Student> iteratort = students.iterator();
        while (iteratort.hasNext()) {
            Student element = iteratort.next();
            if (element.course == course) {
                System.out.println("Name: " + element.name + ", Course: " + element.course);
            }
        }
    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class SortByCourse implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCourse(), o2.getCourse());
    }
}
