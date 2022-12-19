public class Main {
    public static void main(String[] args) {
        Student studentRachel = new Student(new FullName("Rachel", "Green"), 24, 4);
        Student studentJoy = new Student(new FullName("Joy", "Tribiani"), 25, 5);
        System.out.println(studentRachel.info());
        System.out.println(studentRachel.activity());
        System.out.println(studentJoy.info());
        System.out.println(studentJoy.activity());
        Student studentRachelCopy = (Student) studentRachel.clone();
        studentRachelCopy.setCourse(6);
        System.out.println(studentRachel.info());
        System.out.println(studentRachel.activity());
        System.out.println(studentJoy.info());
        System.out.println(studentJoy.activity());
        System.out.println(studentRachelCopy.info());
        System.out.println(studentRachelCopy.activity());
    }
}