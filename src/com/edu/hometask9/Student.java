package com.edu.hometask9;


import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }


    public void printStudent(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student element = iterator.next();
            if (element.course.equals(course)) {
                System.out.println("Name:  " + element.name + ",  Course: " + element.course);
            }
        }
    }

    static class nameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return (o1.getName().compareTo(o2.getName()));

        }
    }

    static class courseComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return (o1.getCourse().compareTo(o2.getCourse()));

        }
    }

    @Override
    public String toString() {
        return '\n'+"Name: " + name + " Course: " + course;
    }
}