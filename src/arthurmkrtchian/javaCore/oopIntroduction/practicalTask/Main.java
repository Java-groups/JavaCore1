package arthurmkrtchian.javaCore.oopIntroduction.practicalTask;



//      Create class Employee which should consist of
//        • three private fields: name, rate and hours;
//        • static field totalSum
//        • properties for access to these fields;
//        • default constructor and two constructors with parameters;
//        • methods:
//        • getSalary() - to calculate the salary of person (rate * hours)
//        • toString() - to output information about employee
//        • getBonuses() – to calculate 10% from salary
//        • In the method main() create 3 objects of Employee type.
//        • Input information about them.
//        • Display the total salary of all workers to screen


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Viktoriya", 1511, 48);
        Employee employee2 = new Employee(43, 1423);
        Employee employee3 = new Employee();
        employee3.setName("Mykola");
        employee3.setRate(1287);
        employee3.setHours(51);

        System.out.printf("Total salary of all employees in this month is: %.2f", Employee.totalSum);
    }
}
