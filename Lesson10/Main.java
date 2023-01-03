package Lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Pam");
        employeeMap.put(2, "Michael");
        employeeMap.put(3, "Kevin");
        employeeMap.put(4, "Oskar");
        employeeMap.put(5, "Creed");
        employeeMap.put(6, "Jim");
        employeeMap.put(7, "Dwight");
        System.out.println(employeeMap);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ID ");
        int id = sc.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("There is no employee with given ID");
        }

        System.out.println("Enter employee name to search ");
        String name = sc.next();
        if (!employeeMap.values().contains(name)) {
            System.out.println("There is no employee with given name");
        }
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println("Found employee " + entry.getValue() + "with ID: " + entry.getKey());
            }
        }
    }
}

