package HM9.HomeWorkTask3;

import java.awt.*;
import java.util.Iterator;

public class Student {
    public String name;
    public Integer course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public void printStudents(List students, Integer course) {
        Iterator<Student> iterator = (Iterator<Student>) students;
        while (iterator.hasNext()) {
            Student m = iterator.next();
            if (m.course.equals(course)) {
                System.out.println(m.name);
            }
        }
    }
}
