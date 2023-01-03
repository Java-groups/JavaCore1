package edu.homeworks.hw9.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
      List<Student> students = new ArrayList<>(List.of(
              new Student("Stepan", "Bilashuk", 3),
              new Student("Bogdan", "Gavryluk", 2),
              new Student("Olga", "Pavlyivna", 1)
      ));
      Student.printStudents(students,3);


     Collections.sort(students, new Comparator<Student>() {
         @Override
         public int compare(Student o1, Student o2) {
             return o1.getFirstName().compareTo(o2.getFirstName());
         }
     });
        for (Student s: students) {
            System.out.println(s.getFirstName());

        }


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        });
        for (Student s: students){
            System.out.println(s.getCourse());
        }
    }
 }
