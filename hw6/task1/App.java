package hw6.task1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Payment[] employees = new Payment[]{
                new SalariedEmployee("emp_1", "Michael", "AA67390", 10, 159),
                new SalariedEmployee("emp_2", "Pam", "FD56830", 5, 159),
                new ContractEmployee("emp_3", "Jeff", 45889, 800),
                new ContractEmployee("emp_4", "Kevin", 87044, 900)
        };
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}
