package edu.homeworks.hw7.task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student firstStudent = new Student(new FullName("Stepan","Bilashuk"),20,3);
        Student secondStudent = new Student(new FullName("Mike","Lee"),19,1);
        System.out.println(firstStudent.info());
        System.out.println(firstStudent.activity());
        System.out.println(secondStudent.info());
        System.out.println(secondStudent.activity());

        Student clonedStudent = (Student) firstStudent.clone();
        clonedStudent.setCourse(2);
        System.out.println(clonedStudent.activity());
        System.out.println(clonedStudent.info());



    }
}