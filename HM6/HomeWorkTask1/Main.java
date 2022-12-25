package HM6.HomeWorkTask1;

//Task description
//        Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeId.
//        Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
//        Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
//        Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//        Include a description of federalTaxIdMember in the class of ContractEmployee.
//        The calculation formula for the "time-worker“ is: the average monthly salary = hourly rate * number of hours worked
//        For employees with a fixed payment the formula is: the average monthly 	salary = fixed monthly payment
//        Create an array of employees and add the employees with different form of payment.
//        Arrange the entire sequence of workers descending the average monthly wage.
//        Output the employee ID, name, and the average monthly wage for all elements of the list.


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee1[] employee1s = {
                new ContractEmployee1("563B","Petro", 5600),
                new ContractEmployee1("289C","Anna", 4580),
                new SalariedEmployee1("58H3", "Anton", 15, 160),
                new SalariedEmployee1("23H3", "Vitalii", 23, 176),
        };

        for (int i = 0; i < employee1s.length; i++) {
            System.out.println(employee1s[i].toString() + "; Salary: $" + employee1s[i].calculatePay());
        }
        System.out.println();

        Arrays.sort(employee1s);
        for (int i = 0; i < employee1s.length; i++) {
            System.out.println(employee1s[i].toString() + "; Salary: $" + employee1s[i].calculatePay());
        }
    }
}
