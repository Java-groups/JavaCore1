package HW9_Collection2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("Alex", 2));
        student.add(new Student("Tom", 4));
        student.add(new Student("Nikolay", 3));
        student.add(new Student("Jon", 2));
        student.add(new Student("Ivan",2));
        student.add(new Student("Oleg",4));
        student.add(new Student("Orest",3));
        student.add(new Student("Serge",1));

        Student student1 = new Student();
        student1.printStudents(student, 2);

        Collections.sort(student, new SortByCourse());
        System.out.println("\n Sort by Course: ");
        for (Student st : student) {
            System.out.println("Name: " + st.getName() + ", Course: " + st.getCourse());
        }


        Collections.sort(student, new SortByName());

        System.out.println("\n Sort by Name: ");
        for (Student st : student) {
            System.out.println("Name: " + st.getName() + ", Course: " + st.getCourse());
        }


    }
}

