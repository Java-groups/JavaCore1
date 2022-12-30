package hw7;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(new FullName("Pavlo", "Grigorenko"), 18, 1));
        students.add(new Student(new FullName("Solomia", "Charivna"), 20, 3));
        students.add((Student) students.get(0).clone());
        students.get(2).setCourse(2);

        for (Student el : students) {
            System.out.println(el.info());
            System.out.println(el.activity());
        }
    }
}
