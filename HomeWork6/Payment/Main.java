package edu.homeworks.hw6.Payment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee tmp;
        Employee[] employee = new Employee[4];
        employee[0] = new SalariedEmployee("Alex",25,50,50,5);
        employee[1] = new ContractEmployee("Brad",1,6500,2);
        employee[2] = new SalariedEmployee("Mary",4,70,200,1);
        employee[3] = new SalariedEmployee("Axie",4,20,50,3);



        for (int x=0;x<employee.length;x++){
            employee[x].calculatePay();
        }

        for (int i = 0; i < employee.length - 1; i++) {
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[i].getSalary() > employee[j].getSalary()) {
                    tmp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = tmp;
                }
            }
        }

        for (int i = 0;i<employee.length;i++){
            System.out.println("ID = " + employee[i].employeeID +"" +
                    " Name =  " + employee[i].getName() +
                    " Salary =  " + employee[i].getSalary());
        }

    }
}