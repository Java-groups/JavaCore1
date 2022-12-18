package HW6_OOP2.Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainEmployee {

    public static void main(String[] args) {

        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("Moni",  "CN308600", 2486.9);
        employees[1] = new ContractEmployee("Tuti",  787989, 144.5, 20);
        employees[2] = new ContractEmployee("Guchi",  234545, 121.25, 19);
        employees[3] = new SalariedEmployee("Sasa",  "CN675234", 1986.5);

        for (Employee employee : employees) {
            employee.calculatePay(); // заповнюэмо поле salary
            employee.print(); // не сортований масив
        }
        Arrays.sort(employees, new NameComparator()); // сортований за ім'ям
        System.out.println();
        for (Employee employee : employees) {
            employee.print();
        }
        Arrays.sort(employees, new TabComparator()); // сортування за зарплатнею
        System.out.println();
        for (Employee employee : employees) {
            employee.print();
        }
    }
}
