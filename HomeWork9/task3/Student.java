package edu.homeworks.hw9.task3;

import java.util.*;


public class Student {
    private String firstName,secondName;
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    Student(String firstName,String secondName,int course){
        this.firstName = firstName;
        this.secondName = secondName;
        this.course = course;
    }
    Student(){};

    public static void printStudents(List students, Integer course){
        Iterator<Student> iterator =students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println("Name = " + student.getFirstName() +
                    "\nSureName = " + student.getSecondName() +
                    "\nCourse = " + course);
        }
    }

}
