package HM9.PracticalTask;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(5648, "Roman");
        employeeMap.put(4568, "Ira");
        employeeMap.put(1248, "Vasyl");
        employeeMap.put(6521, "Petro");
        employeeMap.put(9822, "Ira");
        employeeMap.put(3265, "Anna");
        employeeMap.put(5398, "Olga");

        System.out.println(employeeMap);

        System.out.println("Please enter the employee ID");

        int enteredId = sc.nextInt();
        if (employeeMap.containsKey(enteredId)) {
            System.out.println(employeeMap.get(enteredId));
        } else {
            System.out.println("There is no employee with such an ID");
        }

        System.out.println("Please enter the employee name");
        String enteredName = sc.next();
        Set<Integer> keys = new HashSet<>();
        if (employeeMap.containsValue(enteredName)) {
            for (Map.Entry<Integer, String> m : employeeMap.entrySet()) {
                if (m.getValue().equals(enteredName)) {
                    keys.add(m.getKey());
                }
            }
            System.out.println(keys);
        } else {
            System.out.println("There is no employee with such a name");
        }

    }
}
