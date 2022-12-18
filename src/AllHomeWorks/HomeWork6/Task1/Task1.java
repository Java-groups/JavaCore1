package AllHomeWorks.HomeWork6.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Payment> employeesList = new ArrayList<>(
                Arrays.asList(
                        new SalariedEmployee("Asia", 2, 5),
                        new ContractEmployee("Lara", 67),
                        new SalariedEmployee("Kasia", 3, 0),
                        new ContractEmployee("Vasya", 9)
                )
        );

        employeesList.sort(Comparator.comparingDouble(Payment::calculatePay).reversed());
        for (Payment employee: employeesList) {
            System.out.println(employee);
        }
    }
}
