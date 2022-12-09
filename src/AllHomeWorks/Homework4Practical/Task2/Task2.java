package AllHomeWorks.Homework4Practical.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {

        ArrayList<Employee> employeeList = new ArrayList<>();
        int size = 3;

        for (int i = 0; i < size; i++) {
            System.out.println("---------------------------------------------");
            Employee employee = new Employee();
            employee.input(br);
            employeeList.add(employee);
        }

        int departmentNumber = inputDepartmentNumber(br);
        boolean departmentNumberCheck = false;


        for (Employee employee : employeeList) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                departmentNumberCheck = true;
                System.out.println(employee.getName());
            }
        }

        if (!departmentNumberCheck){
            System.out.println("There are no employers in this Department!");
        }


        Employee tmp ;
        for (int i = 0; i < (size - 1); i++){
            for (int j = (i + 1); j < size; j++){
                if (employeeList.get(i).getSalary() < employeeList.get(j).getSalary()){
                    tmp = employeeList.get(i);
                    employeeList.set(i, employeeList.get(j));
                    employeeList.set(j, tmp);
                }
            }
        }
        System.out.println(
                employeeList
                        .stream()
                        .map(employee -> employee.getName() + ": " + employee.getSalary())
                        .collect(Collectors.toList())
        );

    }
    public static int inputDepartmentNumber(BufferedReader br) throws IOException {
        System.out.println("---------------------------------------------");
        System.out.println("Enter Number of Department:");
        int departmentNumber = -1;
        try {
            departmentNumber = Integer.parseInt(br.readLine());
        } catch (NumberFormatException ignored) {}
        while (departmentNumber <= 0) {
            System.out.println("Incorrect Value!");
            System.out.println("Please input Number of Department:");
            try {
                departmentNumber = Integer.parseInt(br.readLine());
            } catch (NumberFormatException ignored) {}
        }
        return departmentNumber;

    }

}
