public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Sasha", 55, 200000);
        Developer developer = new Developer("Dima", 75, 400000, "Average Java developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}