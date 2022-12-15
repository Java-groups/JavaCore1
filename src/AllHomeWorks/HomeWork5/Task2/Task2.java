package AllHomeWorks.HomeWork5.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Employee> employeesList = new ArrayList<>(
                Arrays.asList(
                        new Developer("Lisa", 20, 1.5, "Average Java Developer"),
                        new Employee("Maria", 30, 0.5),
                        new Developer("Oleg", 25, 5.7, "Php Developer"),
                        new Developer("Alexa", 19, 4.0, "Designer")
                        )
        );

        for (Employee employee: employeesList){
            System.out.println(employee.report());
        }
    }
}
