package hw5.task2;

public class App {
    public static void main(String[] args) {
        Employee e = new Employee("Tom", 37, 58903.87);
        Developer d = new Developer("Albon", 40, 88309.70, "Team lead");
        System.out.println(e.report());
        System.out.println(d.report());
    }
}
