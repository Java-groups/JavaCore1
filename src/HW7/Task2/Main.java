package HW7.Task2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] students = new Student[3];
        students[0] = new Student(new FullName("Anna", "Boiko"), 25);
        students[0].setCourse(3);
        students[1] = new Student(new FullName("Katy", "Watson"), 35);
        students[1].setCourse(4);
        students[2] = (Student) students[0].clone();
        students[2].setCourse(5);


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].info() + " \n " + students[i].activity());

        }


    }
}
