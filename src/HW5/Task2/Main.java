package HW5.Task2;

public class Main {
    public static void main(String[] args) {

        Developer developer = new Developer("Viktor", 32, "Average Java developer", 32735.35);
        System.out.println(developer.report());

        Employee employee = new Employee("Oleg", 35, 27918.05);
        System.out.println(employee.report());
    }
}
