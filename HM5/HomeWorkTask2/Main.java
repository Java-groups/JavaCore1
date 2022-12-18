package HM5.HomeWorkTask2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vasyl", 28, 52315.85);
        Developer developer1 = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee1.report());
        System.out.println(developer1.report());
    }
}
