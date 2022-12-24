package HM7.Task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Roman", "Kukliak"), 30, 456);
        Student student2 = new Student(new FullName("Anna", "Shevchenko"), 35, 854);

        System.out.println(student1.info() + "\n" + student1.activity());
        System.out.println(student2.info() + "\n" + student2.activity());

        Student student1copy = (Student) student1.clone();
        student1copy.courseId = 333;

        System.out.println(student1.info() + "\n" + student1.activity());
        System.out.println(student2.info() + "\n" + student2.activity());
        System.out.println(student1copy.info() + "\n" + student2.activity());
    }
}
