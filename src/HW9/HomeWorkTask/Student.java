package HW9.HomeWorkTask;

import java.util.*;

public class Student implements Comparator<Student> {
    private String name;
    private int course;
    static NameComparator nameComparator = new NameComparator();
    static CourseComparator courseComparator = new CourseComparator();

    static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class CourseComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }

    public static NameComparator getNameComparator() {
        return nameComparator;
    }

    public static CourseComparator getCourseComparator() {
        return courseComparator;
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
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, Integer course) {
        ListIterator<Student> studentIterator = students.listIterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getCourse()==course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tom", 5));
        students.add(new Student("Ken", 2));
        students.add(new Student("Bob", 2));
        students.add(new Student("Den", 3));
        students.add(new Student("Ben", 1));

        for (Student student : students) {
            System.out.println(student);
        }
        students.sort(getNameComparator());
        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }
        students.sort(getCourseComparator());
        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        printStudents(students, 2);

    }


}
