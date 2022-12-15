package HW6.Task1;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new ContractEmployee(2000,"AS12","Arny");
        employees[1] = new SalariedEmployee(31.0,150.5,"DF23", "Bob");
        employees[2] = new ContractEmployee(2500,"DF34","Eva");



        for (int i = 0; i < employees.length; i++) {
        System.out.println(employees[i]); }

    }
}
