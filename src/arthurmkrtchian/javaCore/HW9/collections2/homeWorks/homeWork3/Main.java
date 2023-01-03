package arthurmkrtchian.javaCore.HW9.collections2.homeWorks.homeWork3;
import arthurmkrtchian.javaCore.HW9.collections2.practicalTasks.practicalTask.Names;


//        3. Write class Student that provides information about the name of the student and his
//          course. Class Student should consist of
//          a) properties for access to these fields
//          b) constructor with parameters
//          c) method printStudents (List students, Integer course), which receives a list of students
//          and the course number and prints to the console the names of the students from
//          the list, which are taught in this course (use an iterator)
//        d) methods to compare students by name and by course
//        e) In the main() method
//          • declare List students and add to the list five different students
//          • display the list of students ordered by name
//          • display the list of students ordered by course.



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        fillTheList(students, 5);
        System.out.println("All students:");
        Student.printAllStudents(students);
        System.out.println("\nOnly students from 3th course:");
        Student.printStudents(students, 3);

        Student.sortByCourse(students);
        System.out.println("\nStudents list sorted by course");
        Student.printAllStudents(students);
        Student.sortByName(students);
        System.out.println("\nStudents list sorted by name");
        Student.printAllStudents(students);
    }

    private static void fillTheList(List<Student> studentList, int count){
        Random random = new Random(Names.values().length);
        for (int i = 0; i < count; i++) {
            studentList.add(new Student(Names.values()[random.
                    nextInt(Names.values().length)].
                    toString(),
                    random.nextInt(4) +1));
        }
    }


}
