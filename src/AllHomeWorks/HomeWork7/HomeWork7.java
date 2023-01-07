package AllHomeWorks.HomeWork7;

import java.io.BufferedReader;
import java.io.IOException;

public class HomeWork7 {
    public static void doTask(BufferedReader br) throws IOException {
        Student student = new Student(3, (new FullName("Korol", "Filipp")), 20 );
        Student student2 = new Student(1, (new FullName("Isaeva", "Olena")), 17 );

        System.out.println("Info about Students:");
        student.info();
        System.out.println(student.activity());
        student2.info();
        System.out.println(student2.activity());

        try {
            Student copyOfStudent = (Student) student.clone();
            copyOfStudent.setCourse(4);
            System.out.println("\nInfo about Student after cloning:");
            copyOfStudent.info();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println("\nInfo about Students after cloning:");
        student.info();
        student2.info();

    }
}
