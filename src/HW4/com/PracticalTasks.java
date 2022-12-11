package HW4.com;

import HW4.com.model.Employee;

import java.util.Scanner;

public class PracticalTasks {
    public static void main(String[] args) {
        System.out.println("Start of the first task");
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] array = new int[size];
        int sum = 0;
        int pos = 0;
        int neg = 0;

        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            System.out.print(" " + array[i]);
        }
        int largest = array[0];
        for (int i = 0; i < size; i++) {
            if (largest < array[i]) {
                largest = array[i];

            }

        }
        System.out.println();
        System.out.println("The largest number " + largest);

        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                sum += array[i];
                pos++;
            } else if (array[i] < 0) {
                neg++;
            }
        }
        System.out.println("Sum of positive " + sum);
        System.out.println("Amount of negative " + neg);
        if (sum > neg) {
            System.out.println("Positive is bigger " + pos);
        } else {
            System.out.println("Negative  is bigger " + neg);
        }
        Employee employee1 = new Employee("Polina", 34, 45);
        Employee employee2 = new Employee("Nick", 33, 49);
        Employee employee3 = new Employee("Tate", 55, 34);
        Employee employee4 = new Employee("Kylie", 2, 16);
        Employee employee5 = new Employee("Rose", 56, 79);

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        Employee temp = new Employee();
         sc = new Scanner(System.in);
        System.out.println("Введіть номер департаменту для пошуку");
        int department = sc.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment_number() == department) {
                System.out.println(employees[i].toString());
            }
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < employees.length - 1; i++)
            // compare the elements of the array with a loop
            for (int j = 0; j < employees.length - i - 1; j++)
                // compare two adjacent elements in the array
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    // Swap if the elements aren't in the right order
                    temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }


        }
    }

