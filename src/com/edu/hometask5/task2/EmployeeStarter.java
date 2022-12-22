package com.edu.hometask5.task2;

public class EmployeeStarter {
    public static void main(String[] args) {


        Developer[] developers = new Developer[2];
        developers[0] = new Developer("Oksana", 30, 34200.34, "Average Java developer");
        developers[1] = new Developer("Pavlo", 20, 22200.12, "Intern Java developer");
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Taras", 32, 34200.34);
        employees[1] = new Employee("Vasyl`", 20, 22200.12);

        for (Developer developer : developers) {

            System.out.print(developer.report());
            System.out.println();

        }

        for (Employee employee : employees) {

            System.out.print(employee.report());
            System.out.println();
        }
    }
}


