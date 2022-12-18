package Lesson7.practical2;

public class App {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Teacher(),
                new Student(),
                new Cleaner()
        };
        for (Person el : persons) {
            el.print();
            if (el instanceof Staff) {
                System.out.println("Salary of " + el.getClass().getSimpleName() + ": " + ((Staff) el).salary());
            }
        }
    }
}
