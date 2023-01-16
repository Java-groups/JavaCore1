package arthurmkrtchian.javaCore.HW06.OOP2.homeWorks.homeWork1;


//        Create Payment interface with the method calculatePay(), the base class Employee
//        with a string variable employeeld. Create two classes SalariedEmployee and
//        ContractEmployee, which implement interface and are inherited from the base class.
//        Describe hourly paid workers in the relevant classes (one of the children),
//        and fixed paid workers (second child).
//        Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//        Include a description of federalTaxIdmember in the class of ContractEmployee.
//        The calculation formula for the "time-worker“ is: the average monthly
//        salary = hourly rate * number of hours worked
//        For employees with a fixed payment the formula is: the average monthly salary = fixed monthly payment
//        Create an array of employees and add the employees with different form of payment.
//        Arrange the entire sequence of workers descending the average monthly wage.
//        Output the employee ID, name, and the average monthly wage for all elements of the list.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("Margarita",791921, 2135, 156),
                new SalariedEmployee("Simon    ",692873, 67234.56),
                new SalariedEmployee("Mykola   ",335353, 48129.23),
                new ContractEmployee("Anna     ",122459, 3793, 133),
                new ContractEmployee("Stephan  ",935268, 1789, 184)
        };

        System.out.println("\n========================================= UNSORTED LIST ==============================================");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        System.out.println("\n========================================== SORTED LIST ===============================================");

        Arrays.sort(employees);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

    }
}

