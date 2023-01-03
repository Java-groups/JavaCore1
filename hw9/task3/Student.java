package hw9.task3;

import java.util.*;

public class Student {
    private String name;
    private Integer course;

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

    public void printStudents(List<Student> students, int course) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public int compareByName(Student other) {
        return this.name.compareTo(other.name);
    }

    public int compareByCourse(Student other) {
        return this.course.compareTo(other.course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Oksana", 2),
                new Student("Bogdan", 2),
                new Student("Olena", 3),
                new Student("Olga", 1),
                new Student("Olga", 5)));


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareByName(o2);
            }
        });
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareByCourse(o2);
            }
        });
        System.out.println(students);
    }
}

