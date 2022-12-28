package AllHomeWorks.HomeWork9.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class Task3 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student(2, "Olena"));
        studentsList.add(new Student(3, "Lina"));
        studentsList.add(new Student(5, "Lina"));
        studentsList.add(new Student(3, "Alex"));
        studentsList.add(new Student(2, "Lora"));

        Student.printStudents(studentsList, 3);

        System.out.println("\nSorted by name:");
        studentsList.sort(Comparator.comparing(Student::getName));
        for (Student student: studentsList) {
            System.out.println(student);
        }

        System.out.println("\nSorted by course:");
        studentsList.sort(Comparator.comparingInt(Student::getCourse));
        for (Student student: studentsList) {
            System.out.println(student);
        }
    }
}
