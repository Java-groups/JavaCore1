package HW7;

public class Appl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Oleg", "Nikiforov"), 21, 5);
        Student student2 = new Student(new FullName("Yulia", "Shevchenko"), 18, 2);




        System.out.print(student1.info() + ", ");
        System.out.println();
        System.out.println(student1.activity());

        System.out.print(student2.info() + ", ");
        System.out.println();
        System.out.println(student2.activity());

        Student student1Copy = (Student) student1.clone();
        student1Copy.setCourse(3);
        System.out.print(student1Copy.info() + ", ");
        System.out.println();
        System.out.println(student1Copy.activity());
    }

}
