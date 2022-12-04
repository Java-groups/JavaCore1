package AllHomeWorks.HomeWork2Practical;

import AllHomeWorks.HomeWork2.Person;

import java.io.IOException;
import java.util.ArrayList;

public class HomeWork2Practical {
    public static void doTask() throws IOException {

        ArrayList<Employee> employeeList = new ArrayList<>();
        int sumSalary = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("---------------------------------------------");
            System.out.println(" #" + (i + 1));
            Employee employee = new Employee();
            employee.input();
            int Salary = employee.getSalary();
            sumSalary = Salary + sumSalary;
            System.out.println(sumSalary);
            employeeList.add(employee);

        }
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("---------------");
        System.out.println("Total Salary: " + sumSalary);
        Employee.totalSum = sumSalary;
    }

}

