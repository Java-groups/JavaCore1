import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>() {{
            add(new Student("First", 5));
            add(new Student("Second", 2));
            add(new Student("Third", 2));
            add(new Student("Fourth", 2));
            add(new Student("Fifth", 4));
        }};

        Student.printStudents(students, 2);

        for (Student student : students) {
            System.out.println(student.toString());
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.toString());
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}