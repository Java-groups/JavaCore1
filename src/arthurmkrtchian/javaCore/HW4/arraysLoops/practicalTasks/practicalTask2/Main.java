package arthurmkrtchian.javaCore.HW4.arraysLoops.practicalTasks.practicalTask2;


//  Create a class Employee with fields name, department number, salary. Create five objects
//        of class Employee. Display
//        • all employees of a certain department (enter department number in the console);
//        • arrange workers by the field salary in descending order.


import helper.Reader;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        boolean isDepartmentExists = false;
        Employee[] employees = {
                new Employee("Alex", 8, 1800),
                new Employee("Simon", 4, 1560),
                new Employee("Vazgen", 8, 3200),
                new Employee("Margo", 7, 3600),
                new Employee("Silvia", 4, 1350)
        };

        System.out.print("Enter department number to display all employees which are work in: ");
        int dn = reader.readInteger("Wrong value, please check it and try again.");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartmentNumber() == dn){
                System.out.println(employees[i].toString());
                System.out.println("----------------------------");
                isDepartmentExists = true;
            }
        }
        if(!isDepartmentExists){
            System.out.println("There is no department whit such number.");
        }

        System.out.println("==============================================================================");
        System.out.println("Here is sorted array of employees by salary (descending)");
        Arrays.sort(employees);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            System.out.println("----------------------------");
        }
    }
}
