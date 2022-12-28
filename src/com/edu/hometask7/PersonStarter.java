package com.edu.hometask7;

public class PersonStarter {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1 = new Student(21, new FullName("Ivan", "Zabashta"), 4);
        Student student2 = new Student(20, new FullName("Dmytro", "Kondratuk"), 3);

        Student student1Copy = (Student) student1.clone();
        student1Copy.setCourse(1);

        System.out.print(student1.info() + ", ");
        System.out.println(student1.activity());

        System.out.print(student2.info() + ", ");
        System.out.println(student2.activity());

        System.out.print(student1Copy.info() + ", ");
        System.out.println(student1Copy.activity());
    }
}
