package HW5.Task2;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Taras",32,"Average Java Developer",2500);
        System.out.println(developer.report());

        Employee employee = new Employee("Vika", 30, 2000);
        System.out.println(employee.report());


    }
}
