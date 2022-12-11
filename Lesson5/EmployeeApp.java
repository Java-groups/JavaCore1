package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] allEmployees = {
                new Employee("John", 1, 100),
                new Employee("Bob", 2, 150),
                new Employee("Amanda", 7, 300),
                new Employee("Alfred", 2, 270),
                new Employee("Pam", 1, 200)
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of department: ");
        int enteredDepartmentNumber = sc.nextInt();

        for (Employee el : allEmployees) {
            if (el.getDepartmentNumber() == enteredDepartmentNumber) {
                System.out.println(el);
            }
        }
        sort(allEmployees);
        System.out.println(Arrays.toString(allEmployees));
    }

    static void sort(Employee[] arr) {
        Employee tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getSalary() < arr[j].getSalary()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
