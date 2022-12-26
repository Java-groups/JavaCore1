package HW9.PracticalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        employeeMap.put(1, "Tom");
        employeeMap.put(2, "Ken");
        employeeMap.put(3, "Mark");
        employeeMap.put(4, "Ben");
        employeeMap.put(5, "Bob");
        employeeMap.put(6, "Kevin");
        employeeMap.put(7, "Bob");


        System.out.println(employeeMap);

        System.out.println("Enter ID of the Employee: ");
        int employeeID = Integer.parseInt(br.readLine());

        if (employeeMap.containsKey(employeeID)) {
            System.out.println("Employee with the ID is: " + employeeMap.get(employeeID));
        } else System.out.println("No Employees with this ID");

        System.out.println("Enter name of the Employee: ");
        String employeeName = br.readLine();

        if (!employeeMap.containsValue(employeeName)) {
            System.out.println("There is no Employee with this name");
        } else {

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(employeeName)) {
                System.out.println("ID of this Employee is: " + entry.getKey());
            }

            }
        }

    }
}
