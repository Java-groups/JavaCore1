package com.edu.hometask9;
/*   3. Write class Student that provides information about the name of the student and his
        course. Class Student should consist of
        a) properties for access to these fields
        b) constructor with parameters
        c) method printStudents (List students, Integer course), which receives a list of students and the course number and prints to the console the names of the students from
        the list, which are taught in this course (use an iterator)
        d) methods to compare students by name and by course
        e) In the main() method
        • declare List students and add to the list five different students
        • display the list of students ordered by name
        • display the list of students ordered by course
        */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentStarter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vasyl`", 1));
        students.add(new Student("Petro", 2));
        students.add(new Student("Angela", 5));
        students.add(new Student("Bill", 3));
        students.add(new Student("Amanda", 3));
        students.add(new Student("Jack", 2));
        students.add(new Student("Kyrylo", 5));
        students.add(new Student("Pavlo", 4));

        Student student = new Student();
        student.printStudent(students,5);

        System.out.println("Sorted by names:");
        Collections.sort(students, new Student.nameComparator());
        System.out.println(students);

        System.out.println("Sorted by course:");
        Collections.sort(students, new Student.courseComparator());
        System.out.println(students);

    }
}
