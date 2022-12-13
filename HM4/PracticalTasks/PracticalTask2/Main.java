package HM4.PracticalTasks.PracticalTask2;

import java.util.Scanner;

//Task description
//        Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//        all employees of a certain department (enter department number in the console);
//        arrange workers by the field salary in descending order.


public class Main {
    public static void main(String[] args) {
        Employee Employee1 = new Employee("Andrii", 1, "Sales", 2000);
        Employee Employee2 = new Employee("Pavlo", 2, "Development", 3000);
        Employee Employee3 = new Employee("Iryna", 3, "Finance", 4500);
        Employee Employee4 = new Employee("Vasyl", 1, "Sales", 5000);
        Employee Employee5 = new Employee("Bogdan", 3, "Finance", 2100);
        //not finished

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the department number");
        int input = sc.nextInt();

        if (Employee1.number == input) {System.out.println(Employee1.name);}
        if (Employee2.number == input) {System.out.println(Employee2.name);}
        if (Employee3.number == input) {System.out.println(Employee3.name);}
        if (Employee4.number == input) {System.out.println(Employee4.name);}
        if (Employee5.number == input) {System.out.println(Employee5.name);}
    }
}
