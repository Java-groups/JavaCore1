package HW6.Task1;

import java.lang.reflect.Array;
import java.util.Arrays;

/* Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeld.
 Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
Describe the string variable socialSecurityNumber in the class SalariedEmployee .
Include a description of federalTaxIdmember in the class of ContractEmployee.
The calculation formula for the "time-worker“ is: the average monthly
	salary = hourly rate * number of hours worked
For employees with a fixed payment the formula is: the average monthly 	salary = fixed monthly payment
Create an array of employees and add the employees with different form of payment.
Arrange the entire sequence of workers descending the average monthly wage. Output the employee ID, name, and the average monthly wage for all elements of the list.


   */
public class Appl {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee(79684, 3794285, "Ivan", 50, 160),
                new SalariedEmployee(69874, 688397, "Mykyta", 300),
                new SalariedEmployee(69859, 688712, "Serhii", 350),
                new ContractEmployee(42791, 379459, "Oleg", 60, 170),
        };
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        Arrays.sort(employees);
        System.out.println();
        for(Employee employee : employees){
            System.out.println(employee);
        }



    }
}
