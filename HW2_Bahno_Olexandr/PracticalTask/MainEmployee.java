package PracticalTask;

import static PracticalTask.Employee.totalSum;

public class MainEmployee {
    public static void main(String[] args) {
        // In the method main() create 3 objects of Employee type
        // Input information about them
        Employee person1 = new Employee();
        person1.setName("Alex");
        person1.setHours(150.5);
        person1.setRate(20);
        person1.getSalary(person1.getRate(), person1.getHours());

        Employee person2 = new Employee("Pavel");
        person2.setHours(123);
        person2.setRate(24.4);
        person2.getSalary(person2.getRate(), person2.getHours());

        Employee person3 = new Employee("Dima", 19.2);
        person3.setHours(100);
        person3.getSalary(person3.getRate(), person3.getHours());

        // Display the total salary of all workers to screen
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println("Total salary of all workers: " + totalSum);
        System.out.println("Total bonus of all workers: " + (totalSum * 0.1));
        System.out.println("Total salary + bonus of all workers: " + (totalSum + totalSum * 0.1));
    }
}
