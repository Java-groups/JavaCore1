package HW7_innerClasses;

import java.util.ArrayList;
import java.util.List;

public class MainPerson implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person student1 = new Student(47, new FullName("Alexandr", "Bahno"), 1);
        Person student2 = new Student(25, new FullName("Igor", "Shevchenko"), 2);

        System.out.println();
        System.out.println(student1.info());
        System.out.println(student2.info());

        System.out.println();
        System.out.println("student1: " + student1.activity());
        System.out.println("student2: " + student2.activity());

        System.out.println();
        Student copyOfStudent = (Student) student1.clone();
        System.out.println("Clone: " + copyOfStudent);

        System.out.println();
        copyOfStudent.setCourse(4);
        System.out.println("Clone modified: " + copyOfStudent);

        List<String> student = new ArrayList<>();
        student.add(String.valueOf(student1));
        student.add(String.valueOf(student2));
        student.add(String.valueOf(copyOfStudent));
        System.out.println();

        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }


    }
}
