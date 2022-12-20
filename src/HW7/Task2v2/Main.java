package HW7.Task2v2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] students = new Student[3];
        students[0] = new Student("Ann", "Mask", 25, 1);
        students[1] = new Student("Bob", "Catler", 28, 3);
        students[2] = (Student) students[0].clone();
        students[2].setCourse(2);



        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].info() + " " + students[i].activity());
        }

    }
}
