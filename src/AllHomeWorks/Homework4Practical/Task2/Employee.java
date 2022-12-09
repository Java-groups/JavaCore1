package AllHomeWorks.Homework4Practical.Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter Name:");
        String name = br.readLine();

        while (name.isEmpty()) {
            System.out.println("Name cannot be empty. Enter Name:");
            name = br.readLine();
        }
        this.setName(name);


        System.out.println("Enter Number of Department:");
        int departmentNumber = -1;
        boolean enteredFloat = false;
        try {
            departmentNumber = Integer.parseInt(br.readLine());
            enteredFloat = true;

        } catch (NumberFormatException ignored) {}
        while (!enteredFloat) {
            System.out.println("Incorrect Value!");
            System.out.println("Please input Number of Department:");
            try {
                departmentNumber = Integer.parseInt(br.readLine());
                enteredFloat = true;

            } catch (NumberFormatException ignored) {}
        }
        this.setDepartmentNumber(departmentNumber);


        System.out.println("Enter Hours:");
        int salary = -1;
        enteredFloat = false;

        try {
            salary = Integer.parseInt(br.readLine());
            enteredFloat = true;

        } catch (NumberFormatException e) {}

        while (!enteredFloat) {
            System.out.println("Incorrect Value!");
            System.out.println("Please input Hours:");
            try {
                salary = Integer.parseInt(br.readLine());
                enteredFloat = true;

            } catch (NumberFormatException ignored) {}
        }
        this.setSalary(salary);
    }

}
