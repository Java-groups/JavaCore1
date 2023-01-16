package arthurmkrtchian.javaCore.HW09.collections2.homeWorks.homeWork3;


//        3. Write class Student that provides information about the name of the student and his
//          course. Class Student should consist of
//          a) properties for access to these fields
//          b) constructor with parameters
//          c) method printStudents (List students, Integer course), which receives a list of students
//          and the course number and prints to the console the names of the students from
//          the list, which are taught in this course (use an iterator)
//        d) methods to compare students by name and by course
//        e) In the main() method
//          • declare List students and add to the list five different students
//          • display the list of students ordered by name
//          • display the list of students ordered by course.

import java.util.*;

public class Student implements Comparable<Student>{

    private String name;
    private int course;

    public static void printStudents(List<Student> listOfStudents, int course){
        Iterator<Student> iterator = listOfStudents.iterator();
        Student current;
        while(iterator.hasNext()){
            current = iterator.next();
            if (current.course == course){
                System.out.println(current.toString());
            }
        }
    }

    public static void printAllStudents(List<Student> listOfStudents){
        Iterator<Student> iterator = listOfStudents.iterator();
        while(iterator.hasNext()){
                System.out.println(iterator.next().toString());
        }
    }

    public static void sortByName(List<Student> students){
        students.sort(compareByName);
    }

    public static void sortByCourse(List<Student> students){
        students.sort(compareByCourse);
    }

    private static Comparator<Student> compareByName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };

    private static Comparator<Student> compareByCourse = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.course - o2.course;
        }
    };

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

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student [" +
                "name: " + name +
                ", course: " + course +
                ']';
    }


    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}
