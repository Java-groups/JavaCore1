package HW5.OOP1.Employee;

public class MainEmployee {

    public static void main(String[] args) {
        Employee[] employee = new Employee[3];

        employee[0] = new Employee("Taras", 32, 32735.35);
        employee[1] = new Developer("Taras", 32, 32735.35, "Average Java developer");
        System.out.println(employee[0].report());
        System.out.println(employee[1].report());
    }
}
