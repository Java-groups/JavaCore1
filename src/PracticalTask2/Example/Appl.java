package PracticalTask2.Example;

public class Appl {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ira");
        s1.setRating(4.0);
        System.out.println(s1);

        Student s2 = new Student("Igor");
        s2.setRating(3.5);
        System.out.println(s2);

        Student s3 = new Student("Olga", 4.9);
        System.out.println(s3);

        System.out.println();
        System.out.println(s1.betterStudent(s3));
        System.out.println(s2.betterStudent(s3));
        System.out.println(s1.betterStudent(s2));

        System.out.println();
        System.out.println(Student.avgRating());
    }
}