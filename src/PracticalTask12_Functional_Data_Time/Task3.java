package PracticalTask12_Functional_Data_Time;

import java.util.Arrays;

public class Task3 {

    // Write a method for sorting list of Strings using Java 8
    public static void main(String[] args) {

        StudentSoftServe[] students = {
                new StudentSoftServe("Olexandr", 44),
                new StudentSoftServe("Nazar", 24),
                new StudentSoftServe("Sergi", 19),
                new StudentSoftServe("Artur", 39),
                new StudentSoftServe("Dmitro", 33),
                new StudentSoftServe("Oleksiy", 28)
        };
        Arrays.sort(students, StudentSoftServe::compareByName);
        System.out.println("\nStudentSoftServe compare by name: " + Arrays.toString(students));

        Arrays.sort(students, StudentSoftServe::compareByAge);
        System.out.println("\nStudentSoftServe compare by age: " + Arrays.toString(students));
    }
}

class StudentSoftServe {
    private String name;
    private Integer age;

    public StudentSoftServe(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n[" +
                "name = " + name  +
                ", age = " + age +
                ']';
    }

    public static int compareByName(StudentSoftServe a, StudentSoftServe b) {
        return a.name.compareTo(b.name);
    }

    public static int compareByAge(StudentSoftServe a, StudentSoftServe b) {
        return a.age.compareTo(b.age);
    }
}
