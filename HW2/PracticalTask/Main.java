import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Please enter the data of the " + (i + 1) + " employee");
            System.out.print("Name: ");
            String name = br.readLine();
            System.out.print("Rate: ");
            double rate = parseDouble(br.readLine());
            System.out.print("Hours: ");
            double hours = parseDouble(br.readLine());
            employees[i] = new Employee(name, rate, hours);
            employees[i].dispatchAmountOfSalary();
        }
        System.out.println("Total salary: " + Employee.totalSum);
    }
}