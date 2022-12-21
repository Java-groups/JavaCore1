package HW7.com;

import HW7.com.model.Student;

import java.util.ArrayList;
import java.util.List;

public class HW7 {
    public static void main(String[] args)throws CloneNotSupportedException{
        Person student = new Student(new Student().new FullName("Polina", "Chebukina"), 18);
        Person student1 = new Student(new Student().new FullName("Afonya", "Cat"), 7);

        ((Student) student).setCourse(2);
        ((Student) student1).setCourse(1);
        List<Person> personList = new ArrayList<Person>();
        personList.add(student);
        personList.add(student1);
        Person student2 = new Student();

        student2 = (Person) ((Student) student1).clone();
        ((Student) student2).setCourse(4);
        personList.add(student2);
        for (Person studentSelected : personList) {
            System.out.println(studentSelected.activity());
            studentSelected.info();

        }

    }
}
